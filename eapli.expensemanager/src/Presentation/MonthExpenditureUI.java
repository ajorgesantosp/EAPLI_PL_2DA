package Presentation;

import Controllers.MonthExpenditureController;
import Controllers.WeekExpenditureController;
import Model.Expense;
import java.math.BigDecimal;


public class MonthExpenditureUI {
   /*public void interfaceUI(){
        MonthExpenditureController mecontroller = new MonthExpenditureController();
        for(Expense e : mecontroller.getCurrentMonthExpenses()){
            System.out.println(e);
        }
   }*/
       MonthExpenditureController mec = new MonthExpenditureController();
    
    public MonthExpenditureUI(){
        
    }
    
    public void interfaceUI(){
        for(Expense e : mec.getCurrentMonthExpenses()){
            System.out.println(e);
        }
    }
    
    public BigDecimal showBalance(){
        return mec.getAmountMonthExpenses(mec.getCurrentMonthExpenses());
    }
    
    public void showStuff ()  {
        System.out.println("Month balance:" + showBalance());
    }
}
    

