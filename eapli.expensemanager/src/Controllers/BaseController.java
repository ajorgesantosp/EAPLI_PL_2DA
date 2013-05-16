package Controllers;

import Model.Expense;
import Model.ExpenseRecord;
import Persistence.ExpenseRepository;
import java.math.BigDecimal;
import java.util.ArrayList;

public abstract class BaseController {

    public ArrayList<Expense> getCurrentWeekExpenses() {
      ExpenseRecord er = new ExpenseRecord();
      return er.getCurrentWeekExpenses();

   }

   public BigDecimal getAmountWeekExpenses(ArrayList<Expense> currentWeekExpenses) {
      return new ExpenseRecord().getAmountWeekExpenses(currentWeekExpenses);
   }
}

   
       
