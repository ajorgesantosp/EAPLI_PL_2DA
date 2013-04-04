/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseRegisterController;
import Model.ExpenseType;

import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Paulo Gandra Sousa
 */
class ExpenseRegisterUI extends BaseUI {
    @Override
    public void mainLoop() {
        System.out.println("* * *  REGISTER AN EXPENSE  * * *\n");
        String description = Console.readLine("Description:");
        Date date = Console.readDate("When:");
        double value = Console.readDouble("Amount:");
        BigDecimal amount = new BigDecimal(value);
        
        ExpenseRegisterController controller = new ExpenseRegisterController();        
        //TODO - mostrar a lista dos tipos de despesas
        
        //escreve a lista
        String type = Console.readLine("Type:");
        
        //TODO - Tipos de pagamento
        
        try {
            int type_pos = Integer.parseInt(type);
                        
            //TODO - obter o objecto X da lista
            ExpenseType expenseType = controller.getObjectType(type_pos);

            controller.registerExpense(description, date, amount, expenseType);
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
