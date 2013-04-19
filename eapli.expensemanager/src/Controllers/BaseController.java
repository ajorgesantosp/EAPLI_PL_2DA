package Controllers;

import Model.Expense;
import Model.ExpenseRecord;
import Persistence.ExpenseRepository;
import java.math.BigDecimal;
import java.util.ArrayList;

public abstract class BaseController {

    public BaseController() {
    }

   public BigDecimal getCurrentMonthExpenses() {

        ArrayList<Expense> expenses;
        BigDecimal total;

        ExpenseRepository rep = new ExpenseRepository();
        expenses = rep.getCurrentMonthExpenses();

        ExpenseRecord er = new ExpenseRecord();

        total = er.getTotalAmountExpenses(expenses);

        return total;
    }
        
    public BigDecimal getMonthExpenses(int month, int year) {

        ArrayList<Expense> expenses;
        BigDecimal total;

        ExpenseRepository rep = new ExpenseRepository();
        expenses = rep.getAnyMonthExpenses(month, year);

        ExpenseRecord er = new ExpenseRecord();
        total = er.getTotalAmountExpenses(expenses);

        return total;
    }
}
