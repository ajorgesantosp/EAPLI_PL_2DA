/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Persistence.IncomeTypeRepository;
import java.io.Serializable;

/**
 *
 * @author Jorge Neves e Joaofcmoreira
 */
public class ListIncomeTypeController extends BaseController implements Serializable{
    public ListIncomeTypeController()
    {
        IncomeTypeRepository repo = new IncomeTypeRepository();
        repo.listAllTypes();
    } 
}
