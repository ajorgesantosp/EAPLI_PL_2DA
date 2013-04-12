/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Income;

import java.util.ArrayList;

/**
 *
 * @author antoniopedro
 * @author joasdavid
 */
public class IncomeRepository extends ArrayList<Income>{
    
    private static IncomeRepository instance = null;
    private IncomeRepository() {
    }
    
    public static IncomeRepository getInstance() {
        if(instance==null){
            instance=new IncomeRepository();
            
        }
        return instance;
       
    }
    
}
