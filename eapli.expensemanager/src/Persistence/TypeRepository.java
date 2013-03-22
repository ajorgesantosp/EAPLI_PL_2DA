/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.ExpenseType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rita
 */
public class TypeRepository {

    // class member

    private static List<ExpenseType> listType = new ArrayList<ExpenseType>();
    
    public void save(ExpenseType exp) {
        if (exp == null) {
            throw new IllegalArgumentException();
        }
        listType.add(exp);

    }
}
