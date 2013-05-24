package Persistence.inmemory;

import Persistence.ExpenseTypeRepository;
import Persistence.IExpenseRepository;
import Persistence.IPaymentMeanRepository;
import Persistence.IncomeRepository;
import Persistence.IncomeTypeRepository;
import Persistence.RepositoryFactory;

/**
 *
 * @author Jorge Neves e joaofcmoreira
 * 
 * A class InMemoryRepoFactory vai retornar o tipo de dados que vai ser utilizado nos
 * controllers quando USE CASE usar o Repositorio em memoria
 * 
 * Cada metodo retorna o objecto mais adequado para o controller e este deve usalo da forma correcta
 * 
 */


public class InMemoryRepoFactory implements RepositoryFactory{
   
    public InMemoryRepoFactory() {}

    @Override
    public IExpenseRepository getExpenseRepo() {
        return new InMemoryExpenseRegister();
    }

    @Override
    public ExpenseTypeRepository getExpenseTypeRepo() {
        return new InMemoryExpenseTypeRepository();
    }

    @Override
    public IPaymentMeanRepository getPaymentMeanRepo() {
        return new IMPaymentMeanRepository();
    }

    @Override
    public IncomeTypeRepository getIncomeTypeRepo() {
        return new InMemoryIncomeTypeRepository();
    }

    @Override
    public IncomeRepository getIncomeRepo() {
        return new IMIncomeRepository();
    }
    
}
