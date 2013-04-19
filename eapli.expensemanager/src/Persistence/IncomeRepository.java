/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Income;
import Model.IncomeType;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author antoniopedro
 * @author joasdavid
 */
public class IncomeRepository implements Serializable {
    
    private static List<Income> incomes=new ArrayList<Income>();
    public IncomeRepository() {
    }
     public void save(Income e)
    {
        incomes.add(e);
    }
    
    
}
