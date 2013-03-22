/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.WeekExpenditureController;
import Model.Expense;

/**
 *
 * @author i110687
 */
public class WeekExpenditureUI {
    
    public WeekExpenditureUI(){
        
    }
    
    public void interfaceUI(){
        WeekExpenditureController wec = new WeekExpenditureController();
        for(Expense e : wec.getCurrentWeekExpenses()){
            System.out.println(e);
        }
    }
}
