/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Persistence.ExpenseRepository;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author BragaRafa & Grasher
 */
public class RegisterExpenseWithTypeController {
    public RegisterExpenseWithTypeController() {
    }

    public void registerExpense(String what, Date date, BigDecimal amount, ExpenseType type_pos) {
        Expense expense = new Expense(what, date, amount, ExpenseType);
        ExpenseRepository repo = new ExpenseRepository();
        repo.save(expense);
    }
    
    public String getListType()
    {
        ExpenseTypeRepository repo = new ExpenseTypeRepository();
        String listType = repo.getListType();
        return listType;
    }
    
    public ExpenseType getObjectType(int pos_type)
    {
        ExpenseTypeRepository repo = new ExpenseTypeRepository();
        ExpenseType expenseType = repo.getObjectExpenseType(pos_type);
        return expenseType;
    }
}
