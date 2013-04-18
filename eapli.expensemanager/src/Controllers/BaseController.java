package Controllers;

import Model.Expense;
import Model.ExpenseRecord;
import java.math.BigDecimal;
import java.util.ArrayList;

public abstract class BaseController {

    public ArrayList<Expense> getMonthExpenses() {
        ExpenseRecord er = new ExpenseRecord();
        return er.getMonthExpenses();
    }

    /*public ArrayList<Expense> getAnyMonthExpenses() {
        ExpenseRecord er = new ExpenseRecord();
        return er.getAnyMonthExpenses(month, year);
    }*/
}
