package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select u from Usuario u";
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class); //consulta com tipo
		query.setMaxResults(3);
		
		List<Usuario> usuarios = query.getResultList(); // lista para receber a consulta
		
		for(Usuario usuario: usuarios) {
			System.out.println("ID: " + usuario.getId() + "\n E-mail: " + usuario.getEmail());
		}
		
		em.close();
		emf.close();
	}
}