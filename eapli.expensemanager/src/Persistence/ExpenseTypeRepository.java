/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.ExpenseType;
import java.util.List;
/**
 *
 * @author 1110119/1110285 (artur-kk / kameluh)
 */
public interface ExpenseTypeRepository{
    
    public void save(ExpenseType expT);
    
    public List<ExpenseType> getListOfTypes();
    
    public ExpenseType getExpType(int pos);
    
}