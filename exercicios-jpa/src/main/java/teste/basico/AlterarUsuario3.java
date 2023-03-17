package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7L);
		
		//desassocia��o usa-se o detach. Nesse caso o objeto n�o est� gerenciado(sincronizado)
		em.detach(usuario);
		
		usuario.setNome("Mateus");
		//associoa��o para update, est� gerenciado(sincronizado)
		em.merge(usuario);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
