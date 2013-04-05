package Controllers;

import Model.Expense;
import Persistence.ExpenseRepository;
import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import sun.util.calendar.CalendarDate;


public class MonthExpenditureController {
 
    
     public MonthExpenditureController(){
        
    }
    
    public ArrayList<Expense> getAnyMonthExpenses(int month, int year){
        ArrayList<Expense> AnyMonthExp = new ArrayList<Expense>();
        ArrayList<Expense> expenses;
        DateTime datetimer = new DateTime();
        Calendar today = datetimer.today();
         int current_month = datetimer.currentMonth();
        int current_week = datetimer.currentWeekNumber();
        int current_year = datetimer.currentYear();
        int chosenMonth= month;
        int chosenYear=year;
        ExpenseRepository repo = new ExpenseRepository();
        expenses=repo.getExpenses();
        CalendarDate expDate;
        for(Expense e:expenses){
            expDate = e.getCalendarDate();
            if(expDate.getYear()!=current_year && expDate.getMonth()!=current_month && chosenMonth==month&& chosenYear==year){
               AnyMonthExp.add(e);
            }
        }
        return AnyMonthExp;
            
    }  
    
    public ArrayList<Expense> getMonthExpenses(){
        ArrayList<Expense> monthExp = new ArrayList<Expense>();
        ArrayList<Expense> expenses;
        DateTime datetimer = new DateTime();
        Calendar today = datetimer.today();
         int current_month = datetimer.currentMonth();
        int current_week = datetimer.currentWeekNumber();
        int current_year = datetimer.currentYear();
        ExpenseRepository repo = new ExpenseRepository();
        expenses=repo.getExpenses();
        CalendarDate expDate;
        for(Expense e:expenses){
            expDate = e.getCalendarDate();
            if(expDate.getYear()==current_year && expDate.getMonth()==current_month){
                monthExp.add(e);
            }
        }
        return monthExp;
            
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
    
    


