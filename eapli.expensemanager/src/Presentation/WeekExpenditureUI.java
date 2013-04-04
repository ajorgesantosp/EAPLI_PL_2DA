/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.WeekExpenditureController;
import Model.Expense;
import java.math.BigDecimal;

/**
 *
 * @author i110687
 */
public class WeekExpenditureUI {
    
    WeekExpenditureController wec = new WeekExpenditureController();
    
    public WeekExpenditureUI(){
        
    }
    
    public void interfaceUI(){
        for(Expense e : wec.getCurrentWeekExpenses()){
            System.out.println(e);
        }
    }
    
    public BigDecimal showBalance(){
        return wec.getAmountWeekExpenses(wec.getCurrentWeekExpenses());
    }
}
