/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.hibernate;

import Model.Expense;
import Persistence.IExpenseRepository;
import Persistence.PersistenceInit;
import java.util.Iterator;
import javax.persistence.EntityManager;

/**
 *
 * @author i110617
 */
public class HibernateExpenseRepository implements IExpenseRepository {

    public HibernateExpenseRepository() {
    }
    
    @Override
    public void save(Expense exp) {
        if (exp == null) {
            throw new IllegalArgumentException();
        }
        
        EntityManager manager = PersistenceInit.init();
        manager.getTransaction().begin();
        manager.persist(exp);
        manager.getTransaction().commit();
        manager.close();

    }

    @Override
    public Iterator<Expense> iterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
