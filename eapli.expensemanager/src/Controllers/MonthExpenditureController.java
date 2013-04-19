package Controllers;

import Model.Expense;
import Model.ExpenseRecord;
import java.math.BigDecimal;
import java.util.ArrayList;

public class MonthExpenditureController extends BaseController {

    ArrayList<Expense> expenses;

    public MonthExpenditureController() {
    }
    
    /*
     public ArrayList<Expense> getAnyMonthExpenses(int month, int year) {
     ExpenseRecord er = new ExpenseRecord();
     return er.getAnyMonthExpenses(month, year);
     }

     public BigDecimal getAmountMonthExpenses() {
     ExpenseRecord er = new ExpenseRecord();
     return er.getMonthExpenses();
     }
    
     public BigDecimal getAmountMonthExpenses(int month, int year) {
     ExpenseRecord er = new ExpenseRecord();
     return er.getMonthExpenses(month, year);
     }*/
}
