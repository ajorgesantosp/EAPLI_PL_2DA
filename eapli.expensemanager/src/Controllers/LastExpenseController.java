/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Persistence.ExpenseRepository;

/**
 *
 * @author Rita
 */
public class LastExpenseController extends BaseController{
    
    public LastExpenseController(){
        
    }
    public Expense getLastExpense()
    {
        return new ExpenseRepository().getLast();
    }
}
