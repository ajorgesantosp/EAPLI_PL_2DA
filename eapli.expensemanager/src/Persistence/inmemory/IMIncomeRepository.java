/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.inmemory;

import Model.Income;
import Persistence.IncomeRepository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Antonio
 */
public class IMIncomeRepository implements IncomeRepository{

    static List<Income> incomes = new ArrayList<Income>();
    
    @Override
    public void save(Income income) {
        incomes.add(income);
    }

    
    @Override
    public List<Income> getAll() {
        return incomes;
    }

    @Override
    public BigDecimal getTotal() {
        BigDecimal total = new BigDecimal(0.0);
        for(Income in : incomes){
            total = total.add(in.getAmount());
        }
        return total;
    }

    
    
}
