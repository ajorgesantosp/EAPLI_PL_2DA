package Controllers;

import Model.Expense;
import Model.ExpenseRecord;
import java.math.BigDecimal;
import java.util.ArrayList;

public abstract class BaseController {

    private int year;
    private int month;
            
            
    public BaseController(){
        
    }
    public ArrayList<Expense> getMonthExpenses() {
        ExpenseRecord er = new ExpenseRecord();
        return er.getMonthExpenses();
    }

    public ArrayList<Expense> getAnyMonthExpenses() {
        ExpenseRecord er = new ExpenseRecord();
        return er.getAnyMonthExpenses(month, year);
    }
}
