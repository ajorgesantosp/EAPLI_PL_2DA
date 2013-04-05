/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseRegisterController;
import Model.ExpenseType;

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
        System.out.println("* * *  REGISTER AN EXPENSE  * * *\n");
        String description = Console.readLine("Description: ");
        Date date = Console.readDate("When: ");
        double value = Console.readDouble("Amount: ");
        BigDecimal amount = new BigDecimal(value);
        
        System.out.println("List of Types:");
        ExpenseRegisterController controller = new ExpenseRegisterController();
        ArrayList<ExpenseType> listTypes = controller.getListType();
        
        int sizeOfListTypes = listTypes.size();
        for (int i = 0 ; i < sizeOfListTypes ; i++)
        {
            System.out.println("Pos: " + i);
            System.out.println(listTypes.get(i));
        }
        
        //TODO - mostrar a lista dos tipos de despesas
        
        try {
            int posType = Console.readInteger("Select the position of the type: ");
            ExpenseType expenseType = controller.getObjectType(posType);
            
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
