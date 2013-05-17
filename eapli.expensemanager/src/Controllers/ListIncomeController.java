/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Income;
import Persistence.IncomeRepository;
import java.util.List;

/**
 *
 * @author Antonio
 */
public class ListIncomeController extends BaseController{
    public List<Income>  getAllIncomes() {
        IncomeRepository etr = Persistence.PersistenceFactory.buildRepositoryFactory().getIncomeRepo();
        return etr.getAll();
    }
}
