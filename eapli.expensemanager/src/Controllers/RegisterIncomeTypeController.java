/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.IncomeType;
import Persistence.IncomeTypeRepository;

/**
 *
 * @author jorgeneves & joaofcmoreira
 */
public class RegisterIncomeTypeController {
    
    public RegisterIncomeTypeController(String des){
        IncomeType inc = new IncomeType(des);
        IncomeTypeRepository repo = new IncomeTypeRepository();
        repo.save(inc);
    }
 
}
