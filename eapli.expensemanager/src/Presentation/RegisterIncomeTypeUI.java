package Presentation;

import Controllers.BaseController;
import Controllers.RegisterIncomeTypeController;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author jorgeneves & joaofcmoreira
 */
public class RegisterIncomeTypeUI extends BaseUI implements Serializable{
    private BaseController controller;
    @Override
    public void doShow() {
        System.out.println(" *** Register Income type ***\n");
        System.out.println("Enter type :");
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        controller = new RegisterIncomeTypeController(type);
    }

    @Override
    public String getActionName() {
        return "Register Income type";
    }

    @Override
    protected BaseController controller() {
        return controller;
    }
}
