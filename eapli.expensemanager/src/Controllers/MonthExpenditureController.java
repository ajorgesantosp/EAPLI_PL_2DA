/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseRecord;
import java.math.BigDecimal;
import java.util.ArrayList;


public class MonthExpenditureController extends BaseController {


    public MonthExpenditureController() {
    }

    public ArrayList<Expense> getCurrentMonthExpenses() {
        ExpenseRecord emergencyRoom = new ExpenseRecord();
        return emergencyRoom.getCurrentMonthExpenses();

    }
}