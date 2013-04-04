package Presentation;

import eapli.bootstrap.ExpenseBootstrapper;
import eapli.util.Console;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class MainMenu {

    public void mainLoop() {
        new ExpenseBootstrapper();
        
        // adicionar aqui instâncias de classes com extends BaseUI para aparecem no menu
        BaseUI options[] = new BaseUI[]{ new ExpenseRegisterUI() };
        
        do {
            System.out.println("===================");
            System.out.println("  EXPENSE MANAGER  ");
            System.out.println("===================\n");

            for(int i = 0; i < options.length; i++)
                System.out.format("%2d. %s", i+1, options[i].getActionName());
            System.out.println("0. Exit\n");

            int option = Console.readInteger("Please choose a option");

            if(option == 0) System.out.println("bye bye ...");
            else if(option >= 1 && option <= options.length) options[option - 1].mainLoop();
        } while (true);
    }
}
