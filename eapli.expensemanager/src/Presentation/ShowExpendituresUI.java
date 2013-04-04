package Presentation;

import Controllers.ShowExpendituresController;
import Model.Expense;

public class ShowExpendituresUI {
	public void mainLoop() {
		for(Expense exp : new ShowExpendituresController().iterateExpenditures()) {
			ShowExpenseUI.show(exp);
		}
	}
}
