/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.inmemory;

import Model.ExpenseType;
import Persistence.ExpenseTypeRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1110119/1110285 (artur-kk / kameluh)
 */
public class InMemoryExpenseTypeRepository implements ExpenseTypeRepository{
    
    private static List<ExpenseType> listExpenseType= new ArrayList<ExpenseType>();

    public InMemoryExpenseTypeRepository() {}
    
    @Override
    public void save(ExpenseType expT)
    {
        if (expT==null) throw new IllegalArgumentException();
        listExpenseType.add(expT);
      
    }
    
    @Override
    public List<ExpenseType> getListOfTypes(){
        return listExpenseType;
    }
    
    @Override
    public ExpenseType getExpType(int pos){
       return listExpenseType.get(pos);
    }
    
}
