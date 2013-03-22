/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;
import Persistence.TypeRepository;

/**
 *
 * @author Rita
 */
public class ExpenseTypeRegisterController {
     public ExpenseTypeRegisterController() {
    }

    public void registerType(String name, int id) {
        ExpenseType expense = new ExpenseType(name, id);
        TypeRepository repo = new TypeRepository();
        repo.save(expense);
    }
}
