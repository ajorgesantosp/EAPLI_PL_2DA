/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseRegisterController;
import Controllers.LastExpenseController;
import Model.Expense;

/**
 *
 * @author Rita
 */
public class LastExpenseUI {
    
    public LastExpenseUI()
    {
    }
    
    public void showLastExpense()
    {
        Expense exp = new LastExpenseController().getLastExpense();
        System.out.println("Last expense:\n");
        System.out.println("Description: " + exp.getDescription() + "\n");
        System.out.println("Date: " + exp.getDate()+ "\n");
        System.out.println("Amount: " + exp.getAmount() + "\n");
    }
}
