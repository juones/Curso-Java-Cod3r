package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 1L);
		//para removero objeto gerenciado para não fazer nada sem o merge
		em.detach(usuario);
		usuario.setNome("Nivaldo Bimbão");
		usuario.setEmail("nivaldo@gmail.com");
		
		//em.merge(usuario); //sem o merge também faz o update (tem que ser gerenciado)
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}

}
