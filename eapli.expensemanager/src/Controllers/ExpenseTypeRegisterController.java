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

    public void registerType(String description, int id) {
        ExpenseType expense = new ExpenseType(id, description);
        ExpenseTypeRepository repo = new ExpenseTypeRepository();
        repo.save(expense);
    }
}
