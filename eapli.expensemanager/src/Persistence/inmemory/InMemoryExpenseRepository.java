/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.inmemory;

import Model.*;
import Persistence.ExpenseRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sun.util.calendar.CalendarDate;

/**
 *
 * @author losa + PIPOKID + noobshark
 */
public class InMemoryExpenseRepository implements ExpenseRepository {
    // class member

    private static List<Expense> listExpense = new ArrayList<Expense>();

    public InMemoryExpenseRepository() {
    }

    @Override
    public void save(Expense exp) {
        if (exp == null) {
            throw new IllegalArgumentException();
        }
        listExpense.add(exp);

    }

    @Override
    public Expense getLast() {
        final int size = listExpense.size();
        if (size > 0) {
            Expense last = listExpense.get(0);
            for (int i = 1; i < size; i++) {
                if (listExpense.get(i).getDate().compareTo(last.getDate()) > 0) {
                    last = listExpense.get(i);
                }
            }
            return last;
        }
        return null;
    }

    @Override
    public ArrayList<Expense> getExpenses() {
        return (ArrayList) listExpense;
    }

    /**
     * Returns an ArrayList with the Expenses between 2 CalendarDates
     *
     * @param startDate
     * @param endDate
     * @return
     */
    @Override
    public ArrayList<Expense> getExpenses(CalendarDate startDate, CalendarDate endDate) {
        CalendarDate expDate;
        ArrayList<Expense> weekExp = new ArrayList<Expense>();
        ArrayList<Expense> expenses = (ArrayList) listExpense;
        for (Expense e : expenses) {
            expDate = e.getCalendarDate();
            //if((expDate.getYear()==startDate.getYear() || expDate.getYear()==endDate.getYear()) && (expDate.getMonth()==startDate.getMonth() || expDate.getMonth()==endDate.getMonth()) && expDate.getDayOfMonth()>=startDate.getDayOfMonth() && expDate.getDayOfMonth()<=endDate.getDayOfMonth()){
            if (expDate.getYear() == startDate.getYear() || expDate.getYear() == endDate.getYear()) {
                if (startDate.getMonth() == endDate.getMonth() && expDate.getMonth() == startDate.getMonth()) {
                    if (expDate.getDayOfMonth() >= startDate.getDayOfMonth() && expDate.getDayOfMonth() <= endDate.getDayOfMonth()) {
                        weekExp.add(e);
                    }
                } else if (expDate.getMonth() >= startDate.getMonth() && expDate.getMonth() <= endDate.getMonth()) {
                    if ((expDate.getMonth() == startDate.getMonth() && expDate.getDayOfMonth() >= startDate.getDayOfMonth()) || (expDate.getMonth() == endDate.getMonth() && expDate.getDayOfMonth() <= endDate.getDayOfMonth())) {
                        weekExp.add(e);
                    }
                }
            }
        }
        return weekExp;
    }

    @Override
    public Iterator<Expense> iterator() {
        Iterator<Expense> exp = new Iterator<Expense>() {
            int i = 0;

            @Override
            public boolean hasNext() {
                if (i < listExpense.size()) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public Expense next() {
                return listExpense.get(i++);
            }

            @Override
            public void remove() {
                listExpense.remove(i);
            }
        };
        return exp;
    }

    @Override
    public Iterator<Expense> iterator(final ExpenseType expenseType, final int year, final int month) {
        Iterator<Expense> exp = new Iterator<Expense>() {
            int i = 0;
            boolean found = false, hasNext = false;

            private void search() {
                found = true;
                final int size = listExpense.size();
                for (; i < size; i++) {
                    if (listExpense.get(i).getExpenseType().equals(expenseType) && listExpense.get(i).getCalendarDate().getYear() == year
                            && listExpense.get(i).getCalendarDate().getMonth() == month) {
                        hasNext = true;
                    }
                }
                hasNext = false;
            }

            @Override
            public boolean hasNext() {
                if (!found) {
                    search();
                }
                return hasNext;
            }

            @Override
            public Expense next() {
                if (!found) {
                    search();
                }
                found = false;
                return listExpense.get(i);
            }

            @Override
            public void remove() {
                listExpense.remove(i);
            }
        };
        return exp;
    }
}
