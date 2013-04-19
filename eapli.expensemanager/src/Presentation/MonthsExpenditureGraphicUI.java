/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.MonthsExpenditureGraphicController;
import Controllers.WeekExpenditureController;
import Model.ExpenseRecord;
import Model.TypeTotalExpense;
import eapli.util.Console;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author noobshark & PIPOKID
 */
public class MonthsExpenditureGraphicUI extends BaseUI {

    MonthsExpenditureGraphicController megc = new MonthsExpenditureGraphicController();
    
    @Override
    public void doShow() {
        ArrayList<TypeTotalExpense> values = megc.getMonthExpensesbyType(Console.readInteger("Insert month: "), Console.readInteger("Insert year: "));
        BigDecimal max = values.get(0).getValue();
        int size = values.size();
        for(int j = 0; j < size; j++) {
        	BigDecimal x = new BigDecimal(40);
        	int count = values.get(j).getValue().divide(x).intValueExact();
        	System.out.print(values.get(j).getType().getDescription() + " - ");
        	for(int i = 0; i < count; i++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        System.out.println("* = " + max.divide(new BigDecimal(40)) + "€");
    }

    @Override
    public String getActionName() {
        return "Months Expenditure Graphic";
    }

    @Override
    public void showBalance() {
        WeekExpenditureController wec = new WeekExpenditureController();
        System.out.print("Week balance: " + wec.getAmountWeekExpenses(wec.getCurrentWeekExpenses()));
    }
    
    @Override
    protected BaseController controller() {
        return megc;
    }
    
}
