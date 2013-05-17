/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.IncomeType;
import Persistence.IncomeTypeRepository;
import Persistence.PersistenceFactory;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Jorge Neves e Joaofcmoreira
 */
public class ListIncomeTypeController extends BaseController implements Serializable{
    public ListIncomeTypeController(){    } 
    
    public List<IncomeType> getAll (){
        IncomeTypeRepository repo = PersistenceFactory.buildRepositoryFactory().getIncomeTypeRepo();
        return repo.getListOfTypes();
    }
}
