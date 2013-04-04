/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.MonthExpenditureController;
import Model.Expense;

/**
 *
 * @author miniclip22
 */
public class MonthExpenditureUI {
   public void interfaceUI(){
        MonthExpenditureController mecontroller = new MonthExpenditureController();
        for(Expense e : mecontroller.getCurrentMonthExpenses()){
            System.out.println(e);
        }
   }
}
    

