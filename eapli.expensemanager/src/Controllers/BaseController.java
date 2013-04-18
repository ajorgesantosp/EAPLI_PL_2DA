package Controllers;

import Model.ExpenseRecord;
import java.math.BigDecimal;

public abstract class BaseController {


    public BaseController() {
    }

    public BigDecimal getMonthExpenditure() {
        ExpenseRecord er = new ExpenseRecord();
        return er.getMonthExpenses();
    }
}
