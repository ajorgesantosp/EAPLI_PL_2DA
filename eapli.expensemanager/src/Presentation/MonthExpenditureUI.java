package Presentation;

import Controllers.BaseController;
import Controllers.MonthExpenditureController;
import Model.Expense;

/**
 *
 * @author AC/DC ROCKS!!!!
 */
public class MonthExpenditureUI extends BaseUI {

    MonthExpenditureController mec = new MonthExpenditureController();

    public MonthExpenditureUI() {
    }

    @Deprecated
    public void interfaceUI() {
        for (Expense e : mec.getCurrentMonthExpenses()) {
            System.out.println(e);
        }
    }

    @Override
    public void doShow() {
        System.out.print("Chosen Month balance: " + mec.getCurrentMonthExpenses());
    }

    @Override
    public String getActionName() {
        return "Show chosen Month Expenditure";
    }

    @Override
    protected BaseController controller() {
        return mec;
    }
}
