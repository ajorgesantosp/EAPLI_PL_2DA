/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Persistence.hibernate.HibernateRepoFactory;
import Persistence.inmemory.InMemoryRepoFactory;

/**
 *
 * @author Jorge Neves e joaofcmoreira
 */
public class PersistenceFactory {

    static PersistenceFactory instance = new PersistenceFactory();
   
    private PersistenceFactory() {
    }
    /**
     * 
     * @return PersistenceFactory
     */
    public static PersistenceFactory instance() {
        return instance;

    }

    /**
     * 
     * Retorna HibernateRepoFactory() se estiver a trabalhar com persintencia sobre o hibernate
     * Retorna InMemoryRepoFactory() se estiver a trabalhar com persinstencia em memoria
     * 
     * @return RepositoryFactory
     */
    public RepositoryFactory buildRepositoryFactory() {
        boolean isHibernateFactory = true;
        
        if (isHibernateFactory) {
            return new HibernateRepoFactory();
        } else {
            return new InMemoryRepoFactory();
        }
    }

    

}
