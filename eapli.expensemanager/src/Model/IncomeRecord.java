/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Persistence.inmemory.IMIncomeRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Antonio
 */
public class IncomeRecord {
    
    public List<Income> getAllIncomes(){
         IMIncomeRepository mem=new IMIncomeRepository();
        return mem.getAll();
    }
    
}
