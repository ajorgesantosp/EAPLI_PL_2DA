/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.ExpenseType;
import Model.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author losa
 */
public class ExpenseTypeRepository{
    // class member
    private static List<ExpenseType> listExpenseType= new ArrayList<ExpenseType>();

    public ExpenseTypeRepository() {}
    
    public void save(ExpenseType expT)
    {
        if (expT==null) throw new IllegalArgumentException();
        listExpenseType.add(expT);
      
    }
    
    public List<ExpenseType> getListOfTypes(){
        return listExpenseType;
    }
    
    public ExpenseType getExpType(int pos){
       return listExpenseType.get(pos);
    }
}