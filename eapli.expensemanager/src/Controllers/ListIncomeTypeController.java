/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Persistence.IncomeTypeRepository;

/**
 *
 * @author Jorge Neves
 */
public class ListIncomeTypeController {
    public ListIncomeTypeController()
    {
        IncomeTypeRepository repo = new IncomeTypeRepository();
        repo.listAllTypes();
    } 
}
