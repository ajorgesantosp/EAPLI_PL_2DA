package Controllers;

import Model.Expense;
import Model.ExpenseRecord;
import Persistence.ExpenseRepository;
import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import sun.util.calendar.CalendarDate;


public class MonthExpenditureController {
 
    
     public MonthExpenditureController(){
        
    }
         
         
    public ArrayList<Expense> getMonthExpenses(){
        ExpenseRecord er = new ExpenseRecord();
        return er.getMonthExpenses();
    }
    
       public ArrayList<Expense> getAnyMonthExpenses(){
        ExpenseRecord er = new ExpenseRecord();
        return er.getAnyMonthExpenses(month, year);
    }
    
    public BigDecimal getAmountWeekExpenses(ArrayList<Expense> weekExp){
        BigDecimal total=null;
        for(Expense e:weekExp){
            total=total.add(e.getAmount());
        }
        return total;
    }
     public BigDecimal getAmountAnyMonthExpenses(int month, int year){
        BigDecimal total=null;
        ArrayList<Expense> AnyMonthExp = getAnyMonthExpenses(month, year);
        for(Expense e:AnyMonthExp){
            total=total.add(e.getAmount());
        }
        return total;
    }
   

    public BigDecimal getAmountMonthExpenses(ArrayList<Expense> monthExp){
        BigDecimal total=null;
        for(Expense e:monthExp){
            total=total.add(e.getAmount());
        }
        return total;
    }

}
    
    


