/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseRecord;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author PIPOKID + noobshark
 */
public class WeekExpenditureController {
    
    public WeekExpenditureController(){
        
    }
    
    public ArrayList<Expense> getCurrentWeekExpenses(){
        ExpenseRecord er = new ExpenseRecord();
        return er.getCurrentWeekExpenses();
        
    }
    
    public BigDecimal getAmountWeekExpenses(ArrayList<Expense> weekExp){
        BigDecimal total=null;
        for(Expense e:weekExp){
            total=total.add(e.getAmount());
        }
        return total;
    }
}
