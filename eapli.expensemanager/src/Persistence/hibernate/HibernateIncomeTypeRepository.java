/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.hibernate;

import Model.IncomeType;
import Persistence.IncomeTypeRepository;
import java.util.List;

/**
 *
 * @author Jorge Neves e joaofcmoreira
 */
public class HibernateIncomeTypeRepository implements IncomeTypeRepository{

    public HibernateIncomeTypeRepository() {
    }

    @Override
    public void save(IncomeType incT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IncomeType> getListOfTypes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IncomeType getIncType(int pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IncomeType getLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
