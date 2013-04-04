package Presentation;

import Controllers.LastExpenseController;
import Model.Expense;

/**
 *
 * @author Rita
 */
public class LastExpenseUI extends BaseUI {
    @Override
    public void mainLoop() {
        Expense exp = new LastExpenseController().getLastExpense();
        System.out.println("Last expense:\n");
        System.out.println("Description: " + exp.getDescription() + "\n");
        System.out.println("Date: " + exp.getDate()+ "\n");
        System.out.println("Amount: " + exp.getAmount() + "\n");
    }

    @Override
    public String getActionName() {
        return "Last expense";
    }
}
