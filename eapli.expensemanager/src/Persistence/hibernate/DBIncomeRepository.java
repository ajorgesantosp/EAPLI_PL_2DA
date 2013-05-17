/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.hibernate;

import Model.Income;
import Model.IncomeType;
import Persistence.IncomeRepository;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Antonio
 */
public class DBIncomeRepository extends JPAUtil<IncomeType> implements IncomeRepository {

//falta jpa!!!

    @Override
    public void save(Income income) {
        
        update(income);
    }

    @Override
    public List<Income> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BigDecimal getTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
