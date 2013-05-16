/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
/**
 *
 * @author Joao
 */
public class DBPaymentMeanRepository {
    
    public static EntityManager init()
    {
      EntityManagerFactory factory = Persistence.createEntityManagerFactory("ExpenseManagerPersistence");
      EntityManager manager = factory.createEntityManager();
      return manager;
    }
}
