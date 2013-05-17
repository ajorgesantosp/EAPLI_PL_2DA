package Controllers;

import Model.Expense;
import Model.ExpenseRecord;
import java.math.BigDecimal;
import java.util.ArrayList;

public class MonthExpenditureController extends BaseController {

    public MonthExpenditureController() {
    }

    @Override
    public ArrayList<Expense> getCurrentMonthExpenses() {
        ExpenseRecord er = new ExpenseRecord();
        return er.getCurrentMonthExpenses();
    }

    public BigDecimal getAmountMonhtExpenses(ArrayList<Expense> currentMonthExpenses) {
        return new ExpenseRecord().getAmountMonthExpenses(currentMonthExpenses);
    }
}