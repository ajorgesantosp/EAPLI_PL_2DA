/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseRegisterController;
import Model.ExpenseType;
import Model.PaymentMean;

import eapli.util.Console;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Paulo Gandra Sousa
 */
class ExpenseRegisterUI extends BaseUI {
    @Override
    public void doShow() {
        try
        {
            System.out.println("* * *  REGISTER AN EXPENSE  * * *\n");
            String description = Console.readLine("Description: ");
        
            Date date = Console.readDate("When: ");
            double value = Console.readDouble("Amount: ");
            BigDecimal amount = new BigDecimal(value);
            
            //get the full list of expense type and show it on the screen
            System.out.println("List of Types:");
            ExpenseRegisterController controller = new ExpenseRegisterController();
            ArrayList<ExpenseType> listType = controller.getListType();
            int sizeOfListType = listType.size();
            for (int i = 0 ; i < sizeOfListType ; i++)
            {
                System.out.println("Pos: " + i);
                System.out.println(listType.get(i));
            }
            
            //get the object expense type
            int posType = Console.readInteger("Select the position of the type: ");
            ExpenseType expenseType = controller.getObjectType(posType);
            
            //get the full list of payment mean and show it on the screen
            System.out.println("List of Payment Means:");
            ArrayList<PaymentMean> listPaymentMean = controller.getListPaymentMean();            
            int sizeOfListPaymentMean = listPaymentMean.size();
            for (int i = 0 ; i < sizeOfListPaymentMean ; i++)
            {
                System.out.println("Pos: " + i);
                System.out.println(listPaymentMean.get(i));
            }
            
            //get the object payment mean
            int posPaymentMean = Console.readInteger("Select the position of the payment mean: ");
            PaymentMean paymentMean = controller.getPaymentMean(posPaymentMean);
            
            //save it in the repository
            controller.registerExpense(description, date, amount, expenseType, paymentMean);
            System.out.println("expense recorded.");
        }
        
        catch (Exception e)
        {
            System.out.println("expense couldnt be created");
        }
    }

    @Override
    public String getActionName() {
        return "Register an expense";
    }
}
