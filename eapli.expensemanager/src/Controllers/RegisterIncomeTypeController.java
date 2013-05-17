/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.IncomeType;
import Persistence.IncomeTypeRepository;
import java.io.Serializable;

/**
 *
 * @author jorgeneves & joaofcmoreira
 */
public class RegisterIncomeTypeController extends BaseController implements Serializable {
    
    public RegisterIncomeTypeController(String des){
        IncomeType inc = new IncomeType(des);
        IncomeTypeRepository repo = Persistence.PersistenceFactory.instance().buildRepositoryFactory().getIncomeTypeRepo();
        repo.save(inc);
    }
 
}
