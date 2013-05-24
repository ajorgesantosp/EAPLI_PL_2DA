/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.hibernate;


import Model.PaymentMean;
import Persistence.IPaymentMeanRepository;
import Persistence.PersistenceInit;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Joao
 */
public class DBPaymentMeanRepository implements IPaymentMeanRepository {

    
    public static EntityManager init() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ExpenseManagerPersistence");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }

    @Override
    public PaymentMean save(PaymentMean mean) {
        EntityManager manager = PersistenceInit.init();
        manager.getTransaction().begin();
        manager.persist(mean);
        manager.getTransaction().commit();
        manager.close();
        return mean;
    }

    @Override
    public List<PaymentMean> all() {
        EntityManager manager = PersistenceInit.init();
        Query query = manager.createQuery("select mean from PaymentMean as mean");
        return query.getResultList();
    }

    @Override
    public PaymentMean findById(int index) {
        EntityManager manager = PersistenceInit.init();
        Query query = manager.createQuery("select mean from PaymentMean as mean");
        return (PaymentMean) query.getResultList().get(index);

    }

    public void showPaymentMeans() {
        EntityManager manager = PersistenceInit.init();
        Query query = manager.createQuery("select mean from PaymentMean as mean");
        for (int i = 0; i < query.getResultList().size(); i++) {
            System.out.println(query.getResultList().get(i));
        }

    }
}
