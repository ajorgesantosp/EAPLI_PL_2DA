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
public class WeekExpenditureController extends BaseController{
    
    /**
     * Empty Constructor
     */
    public WeekExpenditureController(){
        
    }
    
    /**
     * Returns the current week expenses.
     * @return ArrayList<Expense>
     */
    public ArrayList<Expense> getCurrentWeekExpenses(){
        ExpenseRecord er = new ExpenseRecord();
        return er.getCurrentWeekExpenses();
        
    }
}
