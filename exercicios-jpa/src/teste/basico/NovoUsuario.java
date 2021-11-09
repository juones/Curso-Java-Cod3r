package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {
	
	public static void main(String[] args) {
		
		//interagindo com as classes do JPA que az o CRUD
		
		//o entity manager factory vai criar um novo EM que vai lidar com o CRUD do banco
		//no emf é necessário passar o nome da unidade de persistencia(qual é o banco que quero conectar
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		//interagindo com métodos de persistencia
		Usuario novoUsuario = new Usuario("Excluido", "excluido@gmail.com");
		
		//o em só gera persistencia no contexto de transação, por isso é necessário chamar o getTransaction begin e commit
		em.getTransaction().begin();
		em.persist(novoUsuario); //persist gera um insert
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
