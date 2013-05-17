package Persistence.hibernate;

import Model.IncomeType;
import Persistence.IncomeTypeRepository;
import Persistence.PersistenceInit;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Jorge Neves e joaofcmoreira
 */
public class HibernateIncomeTypeRepository implements IncomeTypeRepository{

    public HibernateIncomeTypeRepository() {
    }

    @Override
    public void save(IncomeType incT) {
        EntityManager manager = PersistenceInit.init();
        manager.getTransaction().begin();
        manager.persist(incT);
        manager.getTransaction().commit();
        manager.close();
        
    }

    @Override
    public List<IncomeType> getListOfTypes() {
        
        EntityManager manager = PersistenceInit.init();
        Query query = manager.createQuery("select c from IncomeType as c");
        return query.getResultList();
        
    }

    @Override
    public IncomeType getIncType(int pos) {
        EntityManager manager = PersistenceInit.init();
        Query query = manager.createQuery("select c from IncomeType as c where id = :1");
        query.setParameter("1", pos);
        return (IncomeType)query.getSingleResult();
    }

    
}
