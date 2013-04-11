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
 * @author noobshark & PIPOKID
 */
public class WeekExpenditureUI extends BaseUI {
    
    WeekExpenditureController wec = new WeekExpenditureController();
    
    public WeekExpenditureUI(){
        
    }
    
    @Deprecated
    public void interfaceUI(){
        for(Expense e : wec.getCurrentWeekExpenses()){
            System.out.println(e);
        }
    }

    @Override
    public void doShow() {
        System.out.print("Week balance: " + wec.getAmountWeekExpenses(wec.getCurrentWeekExpenses()));
    }

    @Override
    public String getActionName() {
        return "Show Week Expenditure";
    }
}
