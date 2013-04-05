/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;

import Persistence.*;
import java.util.List;
/**
 *
 * @author 1110119/1110285 (artur-kk / kameluh)
 */
public class ExpenseTypeController {

    public ExpenseTypeController() {
    }

    public void registerExpenseType(String type) {
        ExpenseType expenseType = new ExpenseType (type);
        ExpenseTypeRepository repo = new ExpenseTypeRepository();
        repo.save(expenseType);
    }
    
    public List<ExpenseType> getAllExpTypes(){
        ExpenseTypeRepository repo = new ExpenseTypeRepository();
        return repo.getListOfTypes();
    }
}