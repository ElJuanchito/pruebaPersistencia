package co.edu.uniquindio.prueba;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UtilJPA {
	private static final String PUname = "prueba"; // Cambia esto según tu configuración

    private static EntityManagerFactory entityManagerFactory;

    public static EntityManagerFactory getEntityManagerFactory() {
        if (entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory(PUname);
        }
        return entityManagerFactory;
    }

    public static void closeEntityManagerFactory() {
        if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }
    }
}
