 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Persistence.ExpenseRepository;
import Persistence.ExpenseTypeRepository;
import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import sun.util.calendar.CalendarDate;

/**
 *
 * @author miniclip22 & ... & noobshark & PIPOKID
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
     * Returns a list of a defined week expenses.
     * @param startDate
     * @param endDate
     * @return ArrayList<Expense>
     */
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

    /* Visualizacao do gasto do mes corrente */
    /* public BigDecimal getMonthExpenses() {

     int year = DateTime.currentYear();
     int month = DateTime.currentMonth();

     CalendarDate expDate;
     for (Expense e : expenses) {
     expDate = e.getCalendarDate();
     if (expDate.getMonth() == month && expDate.getYear() == year) {
     total = total.add(e.getAmount());
     }
     }
     return total;
     }*/

    /* Visualizacao do  gasto do mes por parametro */
    /*   public BigDecimal getMonthExpenses(int month, int year) {

     CalendarDate expDate;
     for (Expense e : expenses) {
     expDate = e.getCalendarDate();
     if (expDate.getMonth() == month && expDate.getYear() == year) {
     total = total.add(e.getAmount());
     }
     }
     return total;
     }
     */
    public BigDecimal getTotalAmountExpenses(ArrayList<Expense> monthExp) {

        BigDecimal total = new BigDecimal(0);

        for (Expense e : monthExp) {
            total = total.add(e.getAmount());
        }
        return total;
    }
    /* Consulta gastos do mes por tipo */
    /*public BigDecimal getAmountExpensesByType(ExpenseType expt) {

     int year = DateTime.currentYear();
     int month = DateTime.currentMonth();

     CalendarDate expDate;
     for (Expense e : expenses) {
     // verificar igualdade com (equals)
     expDate = e.getCalendarDate();
     if (expDate.getMonth() == month && expDate.getYear() == year
     && e.getExpenseType().equals(expt)) {
     total = total.add(e.getAmount());
     }
     }

     return total;
     }*/
    
    /**
     * Returns a list of objects with the type and the amount of expenses of a month.
     * @param month
     * @param year
     * @return ArrayList<TypeTotalExpense>
     */
    public ArrayList<TypeTotalExpense> getMonthExpensesbyType(int month, int year){
        ExpenseTypeRepository repo = new ExpenseTypeRepository();
    	ArrayList<ExpenseType> expensetypes = (ArrayList<ExpenseType>) repo.getListOfTypes();
    	ArrayList<Expense> expenses = getMonthExpenses(month,year);
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
    }
}
