package Presentation;

import Controllers.BaseController;
import Controllers.LastExpenseController;
import Model.Expense;

/**
 *
 * @author RitaNogueira
 */
public class LastExpenseUI extends BaseUI {
   LastExpenseController controller;

   @Override
   public void doShow() {
      controller = new LastExpenseController();
      Expense exp = controller.getLastExpense();
      System.out.println("Last expense:\n");
      System.out.println("Description: " + exp.getDescription() + "\n");
      System.out.println("Date: " + exp.getDate() + "\n");
      System.out.println("Amount: " + exp.getAmount() + "\n");
   }

   @Override
   public String getActionName() {
      return "Last expense";
   }

   @Override
   protected BaseController controller() {
      return controller;
   }
}
