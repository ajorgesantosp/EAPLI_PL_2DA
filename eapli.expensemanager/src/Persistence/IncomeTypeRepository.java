/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.IncomeType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorgeneves & joaofcmoreira
 */
public interface IncomeTypeRepository {
    
    public void save(IncomeType incT);
    
    public List<IncomeType> getListOfTypes();
    
    public IncomeType getIncType(int pos);
   
    public IncomeType getLast();
}
