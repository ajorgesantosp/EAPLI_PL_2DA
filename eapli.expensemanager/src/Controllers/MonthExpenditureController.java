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
    
    public ArrayList<Expense> getCurrentMonthExpenses(){
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
    
}
    
    

