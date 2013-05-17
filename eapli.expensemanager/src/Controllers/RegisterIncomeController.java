/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import Model.ExpenseType;
import java.util.Date;
import Model.Income;

import Model.IncomeType;
import Model.PaymentMean;
import Persistence.IncomeRepository;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author antoniopedro
 * @author joasdavid
 */
public class RegisterIncomeController extends BaseController {
    IncomeRepository etr = Persistence.PersistenceFactory.buildRepositoryFactory().getIncomeRepo();
    public void registIncome(double amount,String date,String desc, IncomeType type){
        Date data=new Date(date);
        
                
        Income inc=new Income(desc, data, BigDecimal.valueOf(amount), type);
        
        etr.save(inc);
        
    }
    public List<ExpenseType> getExpenseTypes() {
        return Persistence.PersistenceFactory.buildRepositoryFactory().getExpenseTypeRepo().getListOfTypes();
    }
    
    public List<PaymentMean> getPaymentMethods() {
        return Persistence.PersistenceFactory.buildRepositoryFactory().getPaymentMeanRepo().getPaymentMeans();
    }
}
