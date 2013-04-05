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
        System.out.println("Insert the Income type: ");
        Scanner sc = new Scanner(System.in);
        getType(sc.nextLine());
    }

    @Override
    public String getActionName() {
        return "Income type";
    }
    
    public IncomeType getType(String type){
        return new IncomeTypeController().getIncome(type);
    }
}
