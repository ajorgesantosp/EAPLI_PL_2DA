/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.hibernate;

import Model.Income;
import Model.IncomeType;
import Persistence.IncomeRepository;
import Persistence.PersistenceInit;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Antonio
 */
public class DBIncomeRepository implements IncomeRepository {



    @Override
    public void save(Income income) {
        EntityManager manager = PersistenceInit.init();
        manager.getTransaction().begin();
        manager.persist(income);
        manager.getTransaction().commit();
        manager.close();
    }

    @Override
    public List<Income> getAll() {
        EntityManager manager = PersistenceInit.init();
        Query query = manager.createQuery("select c from Income as c");
        return query.getResultList();
    }

    @Override
    public BigDecimal getTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
