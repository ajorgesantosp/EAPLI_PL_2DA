/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseType;
import Persistence.ExpenseRepository;
import Persistence.ExpenseTypeRepository;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author BragaRafa & Grasher
 */
public class RegisterExpenseWithTypeController {
    public RegisterExpenseWithTypeController() {
    }

    public void registerExpense(String what, Date date, BigDecimal amount, ExpenseType type_pos) {
        Expense expense = new Expense(what, date, amount, type_pos);
        ExpenseRepository repo = new ExpenseRepository();
        repo.save(expense);
    }
    
    public List<ExpenseType> getListType()
    {
        ExpenseTypeRepository repo = new ExpenseTypeRepository();
        List<ExpenseType> listType = repo.getListOfTypes();
        return listType;
    }
    
    public ExpenseType getObjectType(int pos_type)
    {
        ExpenseTypeRepository repo = new ExpenseTypeRepository();
        ExpenseType expenseType = repo.getObjectExpenseType(pos_type);
        return expenseType;
    }
}
