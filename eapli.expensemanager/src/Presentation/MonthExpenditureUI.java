package Presentation;

import Controllers.MonthExpenditureController;
import Model.Expense;


public class MonthExpenditureUI {
   public void interfaceUI(){
        MonthExpenditureController mecontroller = new MonthExpenditureController();
        for(Expense e : mecontroller.getCurrentMonthExpenses()){
            System.out.println(e);
        }
   }
}
    

