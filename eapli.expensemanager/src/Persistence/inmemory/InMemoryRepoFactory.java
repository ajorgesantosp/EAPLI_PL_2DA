package Persistence.inmemory;

import Persistence.ExpenseRepository;
import Persistence.ExpenseTypeRepository;
import Persistence.IncomeRepository;
import Persistence.IncomeTypeRepository;
import Persistence.PaymentMeanRepository;
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
    public ExpenseRepository getExpenseRepo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpenseTypeRepository getExpenseTypeRepo() {
        return new InMemoryExpenseTypeRepository();
    }

    @Override
    public PaymentMeanRepository getPaymentMeanRepo() {
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
