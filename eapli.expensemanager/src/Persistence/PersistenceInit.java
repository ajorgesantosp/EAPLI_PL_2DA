package Persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Persistence;

/**
 *
 * @author gilfmc & RitaNogueira
 */
@PersistenceUnit
public class PersistenceInit {
   public static EntityManager init() {
      EntityManagerFactory factory = Persistence.createEntityManagerFactory("ExpenseManagerPersistence");
      EntityManager manager = factory.createEntityManager();
      return manager;
   }
}
