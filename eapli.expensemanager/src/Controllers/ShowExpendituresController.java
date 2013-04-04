package Controllers;

import java.util.Iterator;

import Model.Expense;
import Persistence.ExpenseRepository;

/**
 *
 * @author gilfmc
 */
public class ShowExpendituresController {
    public ShowExpendituresController() {
    }

    public Iterable<Expense> iterateExpenditures() {
        return new ExpenseRepository();
    }    
}
