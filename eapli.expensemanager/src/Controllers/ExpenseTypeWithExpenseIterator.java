package Controllers;

import java.util.Iterator;

import Model.Expense;
import Model.ExpenseType;

/**
 * Class used by ShowMonthExpendituresByExpenseTypeController containing all the needed data to accomplish the use case
 * 
 * @author gilfmc & RitaNogueira
 */
public class ExpenseTypeWithExpenseIterator implements Iterable<Expense> {
	private ExpenseType expenseType;
	private Iterator<Expense> expenses;

	public ExpenseTypeWithExpenseIterator(ExpenseType expenseType, Iterator<Expense> expenses) {
		this.expenseType = expenseType;
		this.expenses = expenses;
	}

	public ExpenseType getExpenseType() {
		return expenseType;
	}

	@Override
	public Iterator<Expense> iterator() {
		return expenses;
	}
}
