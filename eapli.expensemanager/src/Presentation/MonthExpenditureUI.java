package Presentation;

import Controllers.BaseController;
import Controllers.MonthExpenditureController;


public class MonthExpenditureUI extends BaseUI {

    MonthExpenditureController controller = new MonthExpenditureController();

    public MonthExpenditureUI() {
    }

    @Override
    public void doShow() {
        System.out.print("Chosen Month balance: " + controller.getCurrentMonthExpenses());
    }

    @Override
    public String getActionName() {
        return "Show Month Expenditure";
    }

    @Override
    protected BaseController controller() {
        return controller;
    }
}
