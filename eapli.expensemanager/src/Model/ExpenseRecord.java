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

/**
 *
 * @author miniclip22 & fmnabreu & noobshark & PIPOKID
 */

public class ExpenseRecord {

    /**
     * Empty Constructor
     */
    public ExpenseRecord() {
    }

    /**
     * Returns a list of current week expenses.
     * @return ArrayList<Expense>
     */
    public ArrayList<Expense> getCurrentWeekExpenses() {
        //Calculo da data de inicio e de fim da semana em que se encontra
        DateTime datetimer = new DateTime();
        Calendar today = datetimer.today();
        int current_month = datetimer.currentMonth();
        int current_week = datetimer.currentWeekNumber();
        int current_year = datetimer.currentYear();
        Calendar first = datetimer.firstDateOfWeek(current_year, current_week), last = datetimer.lastDateOfWeek(current_year, current_week);
        CalendarDate startDate = null, endDate = null;
        startDate.setYear(current_year);
        startDate.setMonth(current_month);
        startDate.setDayOfMonth(first.DAY_OF_MONTH);
        endDate.setYear(current_year);
        endDate.setMonth(current_month);
        endDate.setDayOfMonth(last.DAY_OF_MONTH);
        //---------------------------------------------------------------
        return getAnyWeekExpenses(startDate,endDate);
    }
    
    /**
     * Returns a list of a defined Month expenses.
     * @param startDate
     * @param endDate
     * @return ArrayList<Expense>
     */
    
    public ArrayList<Expense> getCurrentMonthExpenses() {
        //Calculate the end and beginning dates of the current Month. 
        //Example: April 2013= startDate= 1st, April.
        //EndDate=April 30th, 2013.
        DateTime datetimer = new DateTime();
        Calendar today = datetimer.today();
        int current_month = datetimer.currentMonth();
        int current_year = datetimer.currentYear();
        CalendarDate startDate = null, endDate = null;
        startDate.setYear(current_year);
        startDate.setMonth(current_month);
        startDate.setDayOfMonth(1);
        endDate.setYear(current_year);
        endDate.setMonth(current_month);
        if (current_month==1 || current_month==3 || current_month==5 || current_month==7 || current_month==8 || current_month==10 || current_month==12)
        endDate.setDayOfMonth(31);
        else if (current_month==2){
                if (current_year%400 == 0 || current_year%100 != 0 && current_year%4 == 0)
                     endDate.setDayOfMonth(29);
                else endDate.setDayOfMonth(28);
        }
        else endDate.setDayOfMonth(30);
       
       return getAnyMonthExpenses(startDate,endDate);
    }
    
    public ArrayList<Expense> getAnyMonthExpenses(CalendarDate startDate, CalendarDate endDate){
        ArrayList<Expense> expenses;
        ExpenseRepository repo = new ExpenseRepository();
        expenses = repo.getExpenses(startDate, endDate);
        return expenses;
    }
    
    public ArrayList<Expense> getAnyWeekExpenses(CalendarDate startDate, CalendarDate endDate){
        ArrayList<Expense> expenses;
        ExpenseRepository repo = new ExpenseRepository();
        expenses = repo.getExpenses(startDate, endDate);
        return expenses;
    }
    
    /**
     * Returns the total amount of an ArrayList<Expense>
     * @param weekExp
     * @return BigDecimal
     */
    public BigDecimal getAmountWeekExpenses(ArrayList<Expense> weekExp){
        BigDecimal total=null;
        for(Expense e:weekExp){
            total=total.add(e.getAmount());
        }
        return total;
    }

    public BigDecimal getAmountMonthExpenses(ArrayList<Expense> MonthExpenditure){
        BigDecimal total=null;
        for(Expense e:MonthExpenditure){
            total=total.add(e.getAmount());
        }
        return total;
    }
    
    /**
     * Returns a list of objects with the type and the amount of expenses of a month.
     * @param month
     * @param year
     * @return ArrayList<TypeTotalExpense>
     */
  
    /*
    public ArrayList<TypeTotalExpense> getMonthExpensesbyType(int month, int year){
        ExpenseTypeRepository repo = new ExpenseTypeRepository();
    	ArrayList<ExpenseType> expensetypes = (ArrayList<ExpenseType>) repo.getListOfTypes();
    	ArrayList<Expense> expenses = getAnyMonthExpenses(month,year);
        ArrayList<BigDecimal> totals = new ArrayList<BigDecimal>();
        BigDecimal total;
        ArrayList<TypeTotalExpense> totalexpenses = new ArrayList<TypeTotalExpense>();
        for(ExpenseType typeexp : expensetypes) {
            total = null;
            for(Expense exp : expenses) {
                if(typeexp.equals(exp.getExpenseType())) {
                    total.add(exp.getAmount());
                }
            }
            totals.add(total);
        }
        BigDecimal max = totals.get(0);
        int position = 0;
        for(int j = 1 ; j < expensetypes.size(); j++) {
            if(totals.get(j).compareTo(max) == 1) {
                max = totals.get(j);
                position = j;
            }
        }
        int size = expensetypes.size();
        BigDecimal temp1 = null;
        ExpenseType temp2 = null;
        for(int j = 0; j < size; j++) {
            for(int k = 1; k < (size-1); k++) {
                if(totals.get(k-1).compareTo(totals.get(k))==-1) {
                    temp1 = totals.get(k-1);
                    totals.set(k-1, totals.get(k));
                    totals.set(k, temp1);
                    temp2 = expensetypes.get(k-1);
                    expensetypes.set(k-1, expensetypes.get(k));
                    expensetypes.set(k, temp2);
                }
            }
        }
        for(int i=0; i < size; i++) {
        	totalexpenses.add(new TypeTotalExpense(expensetypes.get(i),totals.get(i)));
        }
        return totalexpenses;
    }*/
}
