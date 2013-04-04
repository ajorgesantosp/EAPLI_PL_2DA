/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author losa
 */
public class ExpenseRepository implements IExpenseRepository {
    // class member

    private static List<Expense> listExpense = new ArrayList<Expense>();

    public ExpenseRepository() {
    }

    @Override
    public void save(Expense exp) {
        if (exp == null) {
            throw new IllegalArgumentException();
        }
        listExpense.add(exp);

    }

    public Expense getLast() {
        final int size = listExpense.size();
        if (size > 0) {
            Expense last = listExpense.get(0);
            for(int i=1; i<size; i++){
                if(listExpense.get(i).getDate().compareTo(last.getDate())>0)
                    last = listExpense.get(i);
            }
            return last;
        }
        return null;
    }
    
    public ArrayList<Expense> getExpenses(){
        return (ArrayList)listExpense;
    }

    @Override
    public Iterator<Expense> iterator() {
        Iterator<Expense> exp = new Iterator<Expense>() {
            int i =0;
            @Override
            public boolean hasNext() {
                if(i<listExpense.size())
                    return true;
                else
                    return false;
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
}


