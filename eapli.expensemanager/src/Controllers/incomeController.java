/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import java.util.Date;
import Model.Income;

import Model.IncomeType;
import Persistence.incomeRepository;
import java.math.BigDecimal;

/**
 *
 * @author Antonio
 */
public class incomeController {
    public void registIncome(double amount,String date,String desc, IncomeType type){
        Date data=new Date(date);
        
                
        Income inc=new Income(desc, data, BigDecimal.valueOf(amount), type);
        incomeRepository rep= incomeRepository.getInstance();
        rep.add(inc);
    }
}
