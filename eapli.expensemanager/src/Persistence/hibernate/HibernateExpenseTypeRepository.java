/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.hibernate;

import Model.ExpenseType;
import Persistence.ExpenseTypeRepository;
import Persistence.PersistenceInit;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author 1110119/1110285 (artur-kk / kameluh)
 */
public class HibernateExpenseTypeRepository implements ExpenseTypeRepository{
    
    public HibernateExpenseTypeRepository() {
    }

    @Override
    public void save(ExpenseType expT) {
        EntityManager manager = PersistenceInit.init();
        manager.getTransaction().begin();
        manager.persist(expT);
        manager.getTransaction().commit();
        manager.close();
        
    }

    @Override
    public List<ExpenseType> getListOfTypes() {
        
        EntityManager manager = PersistenceInit.init();
        Query query = manager.createQuery("select c from ExpenseType as c");
        return query.getResultList();
        
    }

    @Override
    public ExpenseType getExpType(int pos) {
        EntityManager manager = PersistenceInit.init();
        Query query = manager.createQuery("select c from IncomeType as c where id = :1");
        query.setParameter("1", pos);
        return (ExpenseType)query.getSingleResult();
    }
    
    
}
