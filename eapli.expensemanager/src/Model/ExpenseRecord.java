/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Persistence.ExpenseRepository;
import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import sun.util.calendar.CalendarDate;

public class ExpenseRecord {

    private int year;
    private int month;
    private BigDecimal val = new BigDecimal(0);

    public ExpenseRecord(int year, int month, BigDecimal val) {
        this.year = year;
        this.month = month;
        this.val = val;
    }

    public ArrayList<Expense> getCurrentWeekExpenses() {
        //Calculo da data de inicio e de fim da semana em que se encontra
        DateTime datetimer = new DateTime();
        Calendar today = datetimer.today();
        int current_month = datetimer.currentMonth();
        int current_week = datetimer.currentWeekNumber();
        int current_year = datetimer.currentYear();
        Calendar first = datetimer.firstDateOfWeek(current_year, current_week), last = datetimer.lastDateOfWeek(current_year, current_week);
        ExpenseRepository repo = new ExpenseRepository();
        CalendarDate startDate = null, endDate = null;
        startDate.setYear(current_year);
        startDate.setMonth(current_month);
        startDate.setDayOfMonth(first.DAY_OF_MONTH);
        endDate.setYear(current_year);
        endDate.setMonth(current_month);
        endDate.setDayOfMonth(last.DAY_OF_MONTH);
        //---------------------------------------------------------------
        ArrayList<Expense> expenses;
        expenses = repo.getExpenses(startDate, endDate);
        return expenses;
    }

    public ArrayList<Expense> getAnyMonthExpenses(int month, int year) {
        ArrayList<Expense> AnyMonthExp = new ArrayList<Expense>();
        ArrayList<Expense> expenses;
        DateTime datetimer = new DateTime();
        Calendar today = datetimer.today();
        int current_month = datetimer.currentMonth();
        int current_week = datetimer.currentWeekNumber();
        int current_year = datetimer.currentYear();
        int chosenMonth = month;
        int chosenYear = year;
        ExpenseRepository repo = new ExpenseRepository();
        expenses = repo.getExpenses();
        CalendarDate expDate;
        for (Expense e : expenses) {
            if (e.getDate().getYear() == year) {
                if (e.getDate().getMonth() == month) {
                    this.val = this.val.add(e.getAmount());
                }
            }
        }
        return AnyMonthExp;
    }

    public ArrayList<Expense> getMonthExpenses() {
        ArrayList<Expense> monthExp = new ArrayList<Expense>();
        ArrayList<Expense> expenses;
        DateTime datetimer = new DateTime();
        Calendar today = datetimer.today();
        int current_month = datetimer.currentMonth();
        int current_week = datetimer.currentWeekNumber();
        int current_year = datetimer.currentYear();
        ExpenseRepository repo = new ExpenseRepository();
        expenses = repo.getExpenses();
        CalendarDate expDate;
        for (Expense e : expenses) {
            expDate = e.getCalendarDate();
             if (e.getDate().getYear() == current_year) {
                if (e.getDate().getMonth() == current_month) {
                    this.val = this.val.add(e.getAmount());
                }
            }
        }
        return monthExp;
    }
}
