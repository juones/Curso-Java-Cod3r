package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 1L);
		usuario.setNome("Nivaldo Junior");
		usuario.setEmail("nivaldo.junior@gmail.com");
		
		em.merge(usuario); //o merge faz o update
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}
}