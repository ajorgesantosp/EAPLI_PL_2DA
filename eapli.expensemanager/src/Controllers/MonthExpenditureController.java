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
public class MonthExpenditureController extends BaseController {

    /**
     * Empty Constructor
     */
    public MonthExpenditureController() {
    }

    public ArrayList<Expense> getCurrentMonthExpenses() {
        ExpenseRecord emergencyRoom = new ExpenseRecord();
        return emergencyRoom.getCurrentMonthExpenses();

    }
}