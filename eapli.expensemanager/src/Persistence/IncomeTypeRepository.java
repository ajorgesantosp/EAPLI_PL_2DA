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
        
        int last = listIncomeType.size()-1;
        for (IncomeType incomeType : listIncomeType) {
            if(incomeType.getDescription().equalsIgnoreCase(incT.getDescription())){
                break;
            }
            if(incomeType.getDescription().equals(listIncomeType.get(last).getDescription())){
                listIncomeType.add(incT);
            }
        }
    }
    
    public List<IncomeType> getListOfTypes(){
        return listIncomeType;
    }
    
    public IncomeType getIncType(int pos){
       return listIncomeType.get(pos-1);
    }
    
    public void listAllTypes(){
        for (IncomeType incomeType : listIncomeType) {
            System.out.println(incomeType.getId()+ " - " + incomeType.getDescription());
        }
    }
    
    public IncomeType getLast(){
        return listIncomeType.get(listIncomeType.size());
    }
}
