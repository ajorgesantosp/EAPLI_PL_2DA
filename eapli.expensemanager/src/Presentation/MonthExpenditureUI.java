package Presentation;

import Controllers.BaseController;
import Controllers.MonthExpenditureController;
import Model.Expense;

public class MonthExpenditureUI extends BaseUI {

    MonthExpenditureController mec = new MonthExpenditureController();

    public BaseController controller() {
        return mec;
    }

    public MonthExpenditureUI() {
    }

    public void interfaceUI() {
        for (Expense e : mec.getCurrentMonthExpenses()) {
            System.out.println(e);
        }
    }

    public void showBalance() {
        System.out.println("Month balance:" + mec.getAmountMonthExpenses(mec.getCurrentMonthExpenses()));
    }

    @Override
    public void doShow() {
        showBalance();
    }

    @Override
    public String getActionName() {
        return "Show Month Expenditure";
    }
}
