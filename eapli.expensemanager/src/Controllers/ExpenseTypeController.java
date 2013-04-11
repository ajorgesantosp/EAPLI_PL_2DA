/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;

import Persistence.*;
import eapli.util.Console;
import java.util.List;
/**
 *
 * @author 1110119/1110285 (artur-kk / kameluh)
 */
public class ExpenseTypeController {

    public ExpenseTypeController() {
    }
    
     public void registerExpenseType() {
        System.out.println("* * *  REGISTER AN EXPENSE TYPE  * * *\n");

        String type = Console.readLine("Expense type name:");
        int id = Console.readInteger("Expense type ID:");

        ExpenseType expenseType = new ExpenseType (id, type);
        ExpenseTypeRepository repo = new ExpenseTypeRepository();
        repo.save(expenseType);

        System.out.println("Expense type saved successfully!");
    }
    
    public List<ExpenseType> getAllExpTypes(){
        ExpenseTypeRepository repo = new ExpenseTypeRepository();
        return repo.getListOfTypes();
    }
}