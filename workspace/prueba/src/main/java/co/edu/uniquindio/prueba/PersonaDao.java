package co.edu.uniquindio.prueba;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class PersonaDao {
	private EntityManagerFactory emf = UtilJPA.getEntityManagerFactory();

	public void guardarCliente(Persona persona) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(persona);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

	public Persona obtenerClientePorId(String id) {
		EntityManager em = emf.createEntityManager();
		Persona cliente = null;

		try {
			cliente = em.find(Persona.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}

		return cliente;
	}
}
