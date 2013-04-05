/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.IncomeType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorgeneves & joaofcmoreira
 */
public class IncomeTypeRepository {
    private static List<IncomeType> listIncomeType= new ArrayList<IncomeType>();

    public IncomeTypeRepository() {}
    
    public void save(IncomeType incT)
    {
        if (incT==null) throw new IllegalArgumentException();
        listIncomeType.add(incT);
    }
    
    public List<IncomeType> getListOfTypes(){
        return listIncomeType;
    }
    
    public IncomeType getIncType(int pos){
       return listIncomeType.get(pos);
    }
    
}
