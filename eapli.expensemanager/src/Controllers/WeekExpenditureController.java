/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Persistence.ExpenseRepository;
import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import sun.util.calendar.CalendarDate;

/**
 *
 * @author i110687
 */
public class WeekExpenditureController {
    
    public WeekExpenditureController(){
        
    }
    
    public ArrayList<Expense> getCurrentWeekExpenses(){
        ArrayList<Expense> weekExp = new ArrayList<Expense>();
        ArrayList<Expense> expenses;
        DateTime datetimer = new DateTime();
        Calendar today = datetimer.today();
        int current_month = datetimer.currentMonth();
        int current_week = datetimer.currentWeekNumber();
        int current_year = datetimer.currentYear();
        Calendar first = datetimer.firstDateOfWeek(current_year, current_week), last = datetimer.lastDateOfWeek(current_year, current_week);
        ExpenseRepository repo = new ExpenseRepository();
        expenses=repo.getExpenses();
        CalendarDate expDate;
        for(Expense e:expenses){
            expDate = e.getDate();
            if(expDate.getYear()==current_year && expDate.getMonth()==current_month && expDate.getDayOfMonth()>=first.DAY_OF_MONTH && expDate.getDayOfMonth()<=last.DAY_OF_MONTH){
                weekExp.add(e);
            }
        }
        return weekExp;
    }
    
    public BigDecimal getAmountWeekExpenses(ArrayList<Expense> weekExp){
        BigDecimal total=null;
        for(Expense e:weekExp){
            total=total.add(e.getAmount());
        }
        return total;
    }
}
