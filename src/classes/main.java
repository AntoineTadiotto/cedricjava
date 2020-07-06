package classes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("");

    EntityManager em = emf.createEntityManager();


}
