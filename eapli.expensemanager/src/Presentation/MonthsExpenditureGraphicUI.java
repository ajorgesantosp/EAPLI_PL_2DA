/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.MonthsExpenditureGraphicController;
import Controllers.WeekExpenditureController;
import eapli.util.Console;
import java.util.ArrayList;

/**
 *
 * @author noobshark & PIPOKID
 */
public class MonthsExpenditureGraphicUI extends BaseUI {

    MonthsExpenditureGraphicController megc = new MonthsExpenditureGraphicController();
    
    @Override
    public void doShow() {
        ArrayList<String> graphic = megc.createGraphic(Console.readInteger("Insert year: "), Console.readInteger("Insert month: "));
        for(String a : graphic) {
            System.out.println(a);
        }
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
