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
    
    public void saveIncomeType(String des){
        IncomeType inc = new IncomeType(des);
        IncomeTypeRepository repo = new IncomeTypeRepository();
        repo.save(inc);
    }
    
    public IncomeType getIncome(int id){
        IncomeTypeRepository repo = new IncomeTypeRepository();
        return repo.getIncType(id);
        
    }
    
    public void ListAllTypes()
    {
        IncomeTypeRepository repo = new IncomeTypeRepository();
        repo.listAllTypes();
    }   
    
    public IncomeType getLast(){
        return new IncomeTypeRepository().getLast();
        
    }
}
