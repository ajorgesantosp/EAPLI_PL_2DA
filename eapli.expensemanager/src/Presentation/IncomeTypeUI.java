/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.IncomeTypeController;
import Model.IncomeType;
import java.util.Scanner;

/**
 *
 * @author jorgeneves & joaofcmoreira
 */
public class IncomeTypeUI extends BaseUI{

    @Override
    public void doShow() {
        System.out.println(" *** Income type ***\n");
        IncomeTypeController inc = new IncomeTypeController();
        inc.ListAllTypes();
        System.out.println("0 -> Register Income Type ");
        
        
    }

    @Override
    public String getActionName() {
        return "Income type";
    }
    
    public IncomeType getType(int type){
        return new IncomeTypeController().getIncome(type);
    }


    public void registerIncomeType(String des){
        System.out.println(" Inserte new Income Type:\n");
        Scanner sc = new Scanner(System.in);
        String desc = sc.nextLine();
        new IncomeTypeController().saveIncomeType(desc);
    
    }
}
