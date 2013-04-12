/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Persistence.ExpenseRepository;
import eapli.util.DateTime;
import java.util.ArrayList;
import java.util.Calendar;
import sun.util.calendar.CalendarDate;

/**
 *
 * @author i110687
 */
public class ExpenseRecord {
    
    public ExpenseRecord(){
        
    }
    
    public ArrayList<Expense> getCurrentWeekExpenses(){
        //Calculo da data de inicio e de fim da semana em que se encontra
        DateTime datetimer = new DateTime();
        Calendar today = datetimer.today();
        int current_month = datetimer.currentMonth();
        int current_week = datetimer.currentWeekNumber();
        int current_year = datetimer.currentYear();
        Calendar first = datetimer.firstDateOfWeek(current_year, current_week), last = datetimer.lastDateOfWeek(current_year, current_week);
        ExpenseRepository repo = new ExpenseRepository();
        CalendarDate startDate=null,endDate=null;
        startDate.setYear(current_year);
        startDate.setMonth(current_month);
        startDate.setDayOfMonth(first.DAY_OF_MONTH);
        endDate.setYear(current_year);
        endDate.setMonth(current_month);
        endDate.setDayOfMonth(last.DAY_OF_MONTH);
        //---------------------------------------------------------------
        ArrayList<Expense> expenses;
        expenses=repo.getExpenses(startDate,endDate);
        return expenses;
    }
}
