/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.*;
import java.util.ArrayList;
import java.util.Iterator;
import sun.util.calendar.CalendarDate;

/**
 *
 * @author losa + PIPOKID + noobshark
 */
public interface ExpenseRepository {
    // class member
    public void save(Expense exp);

    public Expense getLast();

    public ArrayList<Expense> getExpenses();

    /**
     * Returns an ArrayList with the Expenses between 2 CalendarDates
     *
     * @param startDate
     * @param endDate
     * @return
     */
    public ArrayList<Expense> getExpenses(CalendarDate startDate, CalendarDate endDate);
    
    public Iterator<Expense> iterator();

    public Iterator<Expense> iterator(final ExpenseType expenseType, final int year, final int month);
}
