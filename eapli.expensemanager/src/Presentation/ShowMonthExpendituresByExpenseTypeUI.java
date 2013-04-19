package Presentation;

import Controllers.BaseController;
import Controllers.ExpenseTypeWithExpenseIterator;
import Controllers.ShowMonthExpendituresByExpenseTypeController;
import Model.Expense;

/**
 * @author 1110484 & 1110494
 */
public class ShowMonthExpendituresByExpenseTypeUI extends BaseUI {
	ShowMonthExpendituresByExpenseTypeController controller = new ShowMonthExpendituresByExpenseTypeController();

	@Override
	public void doShow() {
		for (ExpenseTypeWithExpenseIterator expenseType : controller) {
			System.out.println(expenseType.getExpenseType().getDescription());
			for(Expense expense : expenseType) {
				System.out.format("\t%-40s%s%4f", expense.getDescription(), expense.getDate().toLocaleString(), expense.getAmount());
			}
		}
	}

	@Override
	public String getActionName() {
		return "Show month expenditures by expense type";
	}

	@Override
	protected BaseController controller() {
		return controller;
	}

}
