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

    public ExpenseRecord() {
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
}
