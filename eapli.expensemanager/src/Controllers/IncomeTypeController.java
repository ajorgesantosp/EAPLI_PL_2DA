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
public class IncomeTypeController {
    
    public IncomeType getIncome(String type){
        IncomeType inc = new IncomeType(type);
        IncomeTypeRepository repo = new IncomeTypeRepository();
        repo.save(inc);
        return inc;
    }
    
}
