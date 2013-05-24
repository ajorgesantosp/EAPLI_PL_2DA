/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.hibernate;

import Model.Expense;
import Persistence.IExpenseRepository;
import java.util.Iterator;

/**
 *
 * @author i110617
 */
public class HibernateExpenseRegister implements IExpenseRepository {

    @Override
    public void save(Expense exp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Iterator<Expense> iterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
