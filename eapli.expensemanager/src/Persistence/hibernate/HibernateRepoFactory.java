package Persistence.hibernate;
import Persistence.ExpenseTypeRepository;
import Persistence.IExpenseRepository;
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
    public IExpenseRepository getExpenseRepo() {
        return new HibernateExpenseRegister();
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
    
    
    
}
