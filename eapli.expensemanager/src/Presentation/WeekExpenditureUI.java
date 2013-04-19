
package Presentation;

import Controllers.BaseController;
import Controllers.WeekExpenditureController;
import Model.Expense;
import java.math.BigDecimal;

/**
 *
 * @author noobshark & PIPOKID
 */
public class WeekExpenditureUI extends BaseUI {

    WeekExpenditureController wec = new WeekExpenditureController();

    public WeekExpenditureUI() {
    }

    @Deprecated
    public void interfaceUI() {
        for (Expense e : wec.getCurrentWeekExpenses()) {
            System.out.println(e);
        }
    }

    @Override
    public void doShow() {
        System.out.print("Week balance: " + wec.getCurrentWeekExpenses());
    }

    @Override
    public String getActionName() {
        return "Show Week Expenditure";
    }

    @Override
    protected BaseController controller() {
        return wec;
    }
}
