package Presentation;

import Controllers.IncomeController;
import Model.IncomeType;
import java.util.Scanner;

/**
 *
 * @author antoniopedro
 * @author joasdavid
 */
public class IncomeUI extends BaseUI{
    @Override
    public void doShow(){
        System.out.println("== ADD NEW INCOME ==");
        System.out.println("Insert amount");
        Scanner ler=new Scanner(System.in);
        double amount=ler.nextDouble();
        System.out.println("Insert date");
        String date=ler.nextLine();
        System.out.println("Description");
        String desc=ler.nextLine();
        System.out.println("Type");
        IncomeTypeUI typeui = new IncomeTypeUI();
        typeui.doShow();
        //String escolha = ler.nextLine();
        IncomeType type=typeui.getIncomeType();
        IncomeController inc=new IncomeController();
        inc.registIncome(amount, date, desc, type);
        
    }

    @Override
    public String getActionName() {
        return "ADD NEW INCOME ";
    }
    
}
