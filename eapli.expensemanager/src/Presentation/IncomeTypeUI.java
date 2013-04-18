/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ListIncomeTypeController;
import Controllers.RegisterIncomeTypeController;
import Controllers.SelectIncomeTypeController;
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
        ListIncomeTypeController inc = new ListIncomeTypeController();
        System.out.println("0 - Register Income Type ");
        System.out.println("Option:  ");
        
        
    }

    @Override
    public String getActionName() {
        return "Income type";
    }
    
    
    
    public IncomeType getIncomeType(){
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        if(type==0){
            System.out.println(" Inserte new Income Type:");
        
            String desc = sc.nextLine();
            RegisterIncomeTypeController resg = new RegisterIncomeTypeController(desc);
            
            
            return new SelectIncomeTypeController().getLast();
            
        }else{
            return new SelectIncomeTypeController().getIncomeType(type);
        }
        
        
        
    }


    public void registerIncomeType(String des){
        System.out.println(" Inserte new Income Type:\n");
        Scanner sc = new Scanner(System.in);
        String desc = sc.nextLine();
        new RegisterIncomeTypeController(des);
    
    }
}
