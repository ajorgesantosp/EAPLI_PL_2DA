package Presentation;

import Controllers.BaseController;
import Controllers.RegisterIncomeController;
import Model.IncomeType;
import java.util.Scanner;

/**
 *
 * @author antoniopedro
 * @author joasdavid
 */
public class IncomeUI extends BaseUI {

    private BaseController controller;

    @Override
    public void doShow() {
        System.out.println("== ADD NEW INCOME ==");
        System.out.println("Insert amount");
        Scanner ler = new Scanner(System.in);
        double amount = ler.nextDouble();
        System.out.println("Insert date");
        String date = ler.nextLine();
        System.out.println("Description");
        String desc = ler.nextLine();
        System.out.println("Type");
        ShowIncomeTypeUI show=new ShowIncomeTypeUI();
        show.doShow();
        
       SelectIncomeTypeUI select=new SelectIncomeTypeUI();
       select.doShow();
       int id=ler.nextInt();
       IncomeType type=select.getIncomeType(id);
        
        controller = new RegisterIncomeController();
        ((RegisterIncomeController) controller).registIncome(amount, date, desc, type);

    }

    @Override
    public String getActionName() {
        return "ADD NEW INCOME ";
    }

    @Override
    protected BaseController controller() {
        return controller;
    }
}
