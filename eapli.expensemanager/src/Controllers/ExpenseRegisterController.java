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
import java.util.ArrayList;
import java.util.List;
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
    
    public ArrayList<ExpenseType> getListType()
    {
        ExpenseTypeRepository repo = new ExpenseTypeRepository();
        List<ExpenseType> listType;
        listType = repo.getListOfTypes();        
        return (ArrayList)listType;
    }
    
    public ExpenseType getObjectType(int pos_type)
    {
        ExpenseTypeRepository repo = new ExpenseTypeRepository();
        ExpenseType expenseType = repo.getExpType(pos_type);
        return expenseType;
    }
    
    
    //TODO - obter a lista de tipos de pagamento
    
}
