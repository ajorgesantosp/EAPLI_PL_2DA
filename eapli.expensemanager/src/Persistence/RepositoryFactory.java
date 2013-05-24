package Persistence;

/**
 *
 * @author Jorge Neves e joaofcmoreira
 */

public interface RepositoryFactory {
    //Vai ser usado pelos controllers que tratam dos Expense
    public IExpenseRepository getExpenseRepo(); 
    //Vai ser usado pelos controllers que tratam dos Expense Type
    public ExpenseTypeRepository getExpenseTypeRepo();
    //Vai ser usado pelos controllers que tratam dos PaymentMean
    public IPaymentMeanRepository getPaymentMeanRepo(); 
    //Vai ser usado pelos controllers que tratam dos Income type
    public IncomeTypeRepository getIncomeTypeRepo(); 
    //Vai ser usado pelos controllers que tratam dos Income
    public IncomeRepository getIncomeRepo(); 
    
}
