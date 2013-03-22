/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.RegisterExpenseWithTypeController;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author BragaRafa & Grasher
 */
public class RegisterExpenseWithTypeUI {
    public void mainLoop() {
        System.out.println("* * *  REGISTER AN EXPENSE WITH TYPE  * * *\n");
        String description = Console.readLine("Description:");
        Date date = Console.readDate("When:");
        double value = Console.readDouble("Amount:");
        BigDecimal amount = new BigDecimal(value);
        
        RegisterExpenseWithTypeController controller = new RegisterExpenseWithTypeController();
        
        //escreve a lista
        System.out.println(controller.getListType());        
        
        String type = Console.readLine("Type:");
        
        try {
            int type_pos = Integer.parseInt(type);
            ExpenseType expenseType = controller.getObjectType(type_pos);

            controller.registerExpense(description, date, amount, expenseType);

            System.out.println("expense with type recorded.");
            
        }
        catch (Exception e)
        {
            System.out.println("expense with type couldnt be created");
        }        
    }
}
