package Persistence.hibernate;
import Persistence.ExpenseRepository;
import Persistence.ExpenseTypeRepository;
import Persistence.IncomeRepository;
import Persistence.IncomeTypeRepository;
import Persistence.PaymentMeanRepository;
import Persistence.RepositoryFactory;

/**
 *
 * @author Jorge Neves e joaofcmoreira
 */
public class HibernateRepoFactory implements RepositoryFactory{

    public HibernateRepoFactory() {
    }

    /**
     * 
     * @return ExpenseRepository
     */
    @Override
    public ExpenseRepository getExpenseRepo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @return ExpenseTypeRepository
     */
    @Override
    public ExpenseTypeRepository getExpenseTypeRepo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * 
     * @return PaymentMeanRepository
     */
    @Override
    public PaymentMeanRepository getPaymentMeanRepo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @return IncomeTypeRepository
     */
    @Override
    public IncomeTypeRepository getIncomeTypeRepo() {
        return new HibernateIncomeTypeRepository();
    }

    /**
     * 
     * @return IncomeRepository
     */
    @Override
    public IncomeRepository getIncomeRepo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
