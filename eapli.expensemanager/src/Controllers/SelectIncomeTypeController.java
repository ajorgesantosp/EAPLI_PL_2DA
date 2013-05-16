/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.IncomeType;
import Persistence.IncomeTypeRepository;

/**
 *
 * @author Jorge Neves e joaofcmoreira
 */
public class SelectIncomeTypeController  extends BaseController{
    
    
    public IncomeType getIncomeType(int id){
        IncomeTypeRepository repo = new IncomeTypeRepository();
        return repo.getIncType(id);
        
    }
      
    
    public IncomeType getLast(){
        return new IncomeTypeRepository().getLast();
        
    }
    
}
