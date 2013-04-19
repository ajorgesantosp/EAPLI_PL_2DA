package Controllers;

import java.util.Iterator;

import Model.ExpenseType;
import Persistence.ExpenseRepository;
import Persistence.ExpenseTypeRepository;

/**
 * Controller for use case "Show month expenditures by expense type"
 * 
 * @author gilfmc & RitaNogueira
 */
public class ShowMonthExpendituresByExpenseTypeController extends BaseController implements Iterable<ExpenseTypeWithExpenseIterator> {
	private int month, year;

	public void setDate(int month, int year) {
		assert (month >= 1 && month <= 12);
		this.month = month;
		this.year = year;
	}

	@Override
	public Iterator<ExpenseTypeWithExpenseIterator> iterator() {
		return new Iterator<ExpenseTypeWithExpenseIterator>() {
			Iterator<ExpenseType> it = new ExpenseTypeRepository().getListOfTypes().iterator();

			@Override
			public ExpenseTypeWithExpenseIterator next() {
				final ExpenseType expenseType = it.next();
				ExpenseTypeWithExpenseIterator type = new ExpenseTypeWithExpenseIterator(expenseType, new ExpenseRepository().iterator(expenseType, year, month));
				return type;
			}

			@Override
			public boolean hasNext() {
				return it.hasNext();
			}

			@Override
			public void remove() {
				it.remove();
			}
		};
	}
}
