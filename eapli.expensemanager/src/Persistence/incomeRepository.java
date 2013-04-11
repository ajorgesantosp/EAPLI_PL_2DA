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
public class incomeRepository extends ArrayList<Income>{
    
    private static incomeRepository instance = null;
    private incomeRepository() {
    }
    
    public static incomeRepository getInstance() {
        if(instance==null){
            instance=new incomeRepository();
            
        }
        return instance;
       
    }
    
}
