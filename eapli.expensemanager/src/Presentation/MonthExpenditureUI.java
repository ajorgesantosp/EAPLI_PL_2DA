package Presentation;

import Controllers.BaseController;
import Controllers.MonthExpenditureController;
import Controllers.WeekExpenditureController;
import Model.Expense;
import java.math.BigDecimal;


public class MonthExpenditureUI  extends BaseUI{
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
        for(Expense e : mec.getMonthExpenses()){
            System.out.println(e);
        }
    }
    
    public void showBalance(){
        System.out.println("Month balance:" + mec.getAmountMonthExpenses(mec.getMonthExpenses()));
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
    

