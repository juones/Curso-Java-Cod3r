package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

//somente as classes que implementarem entidade poderão passar por aqui
public class DAO<E> {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;
	
	//no caso de um atributo static como o emf, ele pode ser inicializado em sua declaração ou
	//no bloco static que serja chamado somente uma vez quando o java carregar a classe
	static {
		//como esse bloco pode gerar um erro grande de carregamento da aplicação é recomendável tratar o erro
		try {
			emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		} catch (Exception e) {
			//logar -> log4j
		}		
	}
	
	public DAO() { //construtor padrao
		this(null);
	}
	
	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}
	
	//um método que retorna a classe atual faz com que ele possa ser chamado encadeadamente
//	public DAO<E> teste(){
//		return this;
//	}
//	
//	public static void main(String[] args) {
//		new DAO<Produto>().teste().teste().teste();
//	}
	
	public DAO<E> abrirTransacao(){
		em.getTransaction().begin();
		return this;
	}
	
	public DAO<E> fecharTransacao() {
		em.getTransaction().commit();
		return this;
	}
	
	public DAO<E> incluir(E entidade){
		em.persist(entidade);
		return this;
	}
	
	//atomico é um método que o método ja vai fazer a inclusao com todas as transações
	public DAO<E> incluirAtomico(E entidade){
		return this.abrirTransacao().incluir(entidade).fecharTransacao();
	}
	
	public E obterPorId(Object id) {
		return em.find(classe, id);
	}
	
	//método para não passar todasas informações abaixo
	public List<E> obterTodos(){
		return this.obterTodos(10, 0);
	}
	
	//método para obter com paginação ( quantidade == limit && deslocamento == offset )
	public List<E> obterTodos(int quantidade, int deslocamento) {
		//se a classe foi setada ou não
		if(classe == null) {
			throw new UnsupportedOperationException("Classe nula.");
		}
		
		String jpql = "SELECT e FROM " + classe.getName() + " e";
		TypedQuery<E> query = em.createQuery(jpql, classe);
		query.setMaxResults(quantidade);
		query.setFirstResult(deslocamento);
		return query.getResultList();
	}
	
	public List<E> consultar(String nomeConsulta, Object... params) {
		TypedQuery<E> query = em.createNamedQuery(nomeConsulta, classe);
		
		for (int i = 0; i < params.length; i += 2) { //para que sejam multiplos de 2
			query.setParameter(params[i].toString(), params[i + 1]);
		}
		
		return query.getResultList();
	}
	
	//como a consulta de média vai me trazer só um resultado, crio um novo método
	public E consultarUm(String nomeConsulta, Object... params) {
		List<E> lista = consultar(nomeConsulta, params);
		return lista.isEmpty() ? null : lista.get(0);
	}
	
	public void fechar () {
		em.close();
	}
}
