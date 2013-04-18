/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import java.util.Date;
import Model.Income;

import Model.IncomeType;
import Persistence.IncomeRepository;
import java.math.BigDecimal;

/**
 *
 * @author antoniopedro
 * @author joasdavid
 */
public class IncomeController {
    public void registIncome(double amount,String date,String desc, IncomeType type){
        Date data=new Date(date);
        
                
        Income inc=new Income(desc, data, BigDecimal.valueOf(amount), type);
        IncomeRepository rep= new IncomeRepository();
        rep.save(inc);
    }
}
