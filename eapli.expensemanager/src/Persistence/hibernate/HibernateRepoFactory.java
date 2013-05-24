package Persistence.hibernate;
import Persistence.ExpenseRepository;
import Persistence.ExpenseTypeRepository;
import Persistence.IPaymentMeanRepository;
import Persistence.IncomeRepository;
import Persistence.IncomeTypeRepository;
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
        return new HibernateExpenseTypeRepository();
    }
    
    /**
     * 
     * @return PaymentMeanRepository
     */
    @Override
    public IPaymentMeanRepository getPaymentMeanRepo() {
        return new DBPaymentMeanRepository();
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
        return new DBIncomeRepository();
    }

    @Override
    public IPaymentMeanRepository getPaymentMeanRepo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
