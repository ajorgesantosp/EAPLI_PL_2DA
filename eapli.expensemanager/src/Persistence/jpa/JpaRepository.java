/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.jpa;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author Antonio
 */
public abstract class JpaRepository<T,PK extends Serializable> {
    @PersistenceUnit
    static protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("eapli.ExpenseManagerPU");
   EntityManager entityManager;
   
   protected EntityManager getEntityManager() {
        
        if(entityManager==null || !entityManager.isOpen())       
            entityManager = emf.createEntityManager();
        
        return entityManager;
    }
    protected Class<T> entityClass;
       
    public JpaRepository() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass()
             .getGenericSuperclass();
        this.entityClass = (Class<T>) genericSuperclass
             .getActualTypeArguments()[0];
    }
    
    public Object create(Object t) {
        this.getEntityManager().persist(t);
        return t;
    }
    public Object update(Object t) {
        return this.getEntityManager().merge(t);
    }

    public void delete(Object t) {
        t = this.getEntityManager().merge(t);
        this.getEntityManager().remove(t);
    }

    public long getTotalCount() {
        return (Long)getEntityManager().createQuery(
            "SELECT COUNT(*) FROM " + entityClass.getSimpleName())
            .getSingleResult();
    }

    public Collection<T> findAll() {
        return getEntityManager().createQuery(
            "FROM " + entityClass.getName())
        .getResultList();
    }

    public T findByPrimaryKey(Serializable pk) {
        return (T)getEntityManager().find(entityClass, pk);
    }
    
}
