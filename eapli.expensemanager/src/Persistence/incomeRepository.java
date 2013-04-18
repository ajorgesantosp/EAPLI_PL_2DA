/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Income;
import Model.IncomeType;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author antoniopedro
 * @author joasdavid
 */
public class incomeRepository {
    
    private static List<Income> incomes=new ArrayList<Income>();
    public incomeRepository() {
    }
     public void save(Income e)
    {
        incomes.add(e);
    }
    
    
}
