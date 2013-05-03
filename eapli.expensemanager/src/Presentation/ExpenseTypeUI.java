/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.ExpenseTypeController;
import Model.ExpenseType;
import eapli.util.Console;

/**
 *
 * @author 1110119/1110285 (artur-kk / kameluh)
 */
class ExpenseTypeUI extends BaseUI {

    private ExpenseTypeController controllerExpT = new ExpenseTypeController();
    
    private void imprimeMenu() {
        System.out.println("========================");
        System.out.println("  EXPENSE TYPE MANAGER  ");
        System.out.println("========================\n");

        System.out.println("1. Register an expense type");
        System.out.println("2. Show all expense types");
        System.out.println("0. Exit\n\n");
    }

    @Override
    public void doShow() {
        int option;
        
        do {
            imprimeMenu();
            option = Console.readInteger("Please choose a option");
            switch (option) {
                case 0:
                    System.out.println("bye bye ...");
                    return;
                case 1:
                    controllerExpT.registerExpenseType();
                    break;
                case 2:

                    System.out.println();
                    for (ExpenseType expT : controllerExpT.getAllExpTypes()) {
                        System.out.println(expT.getDescription());
                    }
                    System.out.println();
                    Console.readLine("Press enter to continue"); //pausar a consola
                    break;
            }
        } while (option != 0);
    }

    @Override
    public String getActionName() {
        return "Expense Type";
    }

    @Override
    protected BaseController controller() {
        return (BaseController) controllerExpT;
    }
}
