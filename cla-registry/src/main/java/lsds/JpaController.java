package lsds;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author milan
 */
public class JpaController {

    private static final EntityManagerFactory emf;

    static {
        emf = Persistence.createEntityManagerFactory("registry");
    }

    /**
     * Öffnet einen neuen EntityManger.
     * 
     * @return EntityManager
     */
    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}
