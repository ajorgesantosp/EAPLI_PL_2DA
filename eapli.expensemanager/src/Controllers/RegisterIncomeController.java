/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import Model.ExpenseType;
import java.util.Date;
import Model.Income;
import Model.IncomeRecord;

import Model.IncomeType;
import Persistence.IncomeRepository;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author antoniopedro
 * @author joasdavid
 */
public class RegisterIncomeController extends BaseController {
    private static IncomeRecord rec=new IncomeRecord();
    public void registIncome(double amount,String date,String desc, IncomeType type){
        Date data=new Date(date);
        
                
        Income inc=new Income(desc, data, BigDecimal.valueOf(amount), type);
        
        rec.save(inc);
        
    }
    public List<ExpenseType> getExpenseTypes() {
        return PersistenceFactory.instance().buildRepositoryFactory().getExpenseTypeRepository().getAll();
    }
    
    public List<PaymentMethod> getPaymentMethods() {
        return PersistenceFactory.instance().buildRepositoryFactory().getPaymentMethodRepository().getAll();
    }
}
