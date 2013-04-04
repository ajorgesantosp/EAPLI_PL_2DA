/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseType;

import java.math.BigDecimal;
import java.util.Date;
import Persistence.*;
/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpenseRegisterController {

    public ExpenseRegisterController() {
    }    
    
    public void registerExpense(String what, Date date, BigDecimal amount, ExpenseType type_pos) {
        Expense expense = new Expense(what, date, amount, type_pos);
        ExpenseRepository repo = new ExpenseRepository();
        repo.save(expense);
    }
    
    public String getListType()
    {
        ExpenseRepository repo = new ExpenseRepository();
        String listType = repo.getListType();
        return listType;
    }
    
    public ExpenseType getObjectType(int pos_type)
    {
        //TODO - mudar para EXPENSE TYPE
        ExpenseRepository repo = new ExpenseRepository();
        ExpenseType expenseType = repo.getObjectExpenseType(pos_type);
        return expenseType;
    }
    
}
