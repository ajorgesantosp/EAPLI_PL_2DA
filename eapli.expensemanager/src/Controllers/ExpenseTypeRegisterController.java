/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;
import Persistence.ExpenseTypeRepository;

/**
 *
 * @author Rita
 */
public class ExpenseTypeRegisterController {
     public ExpenseTypeRegisterController() {
    }

    public void registerType(String name, int id) {
        ExpenseType expense = new ExpenseType(name, id);
        ExpenseTypeRepository repo = new ExpenseTypeRepository();
        repo.save(expense);
    }
}
