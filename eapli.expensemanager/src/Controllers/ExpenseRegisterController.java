/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseType;
import Model.PaymentMean;
import java.math.BigDecimal;
import java.util.Date;
import Persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpenseRegisterController extends BaseController {

    public ExpenseRegisterController()  {
    }    
    
    /**
     * Creates an expense with several parameters and will save it in the repository and doesn't return anything
     * @param what
     * @param date
     * @param amount
     * @param expenseType
     * @param paymentMean 
     */
    public void registerExpense(String what, Date date, BigDecimal amount, ExpenseType expenseType, PaymentMean paymentMean) {
        Expense expense = new Expense(what, date, amount, expenseType, paymentMean);
        ExpenseRepository repo = new ExpenseRepository();
        repo.save(expense);
    }
    
    /**
     * Returns the full list of Expense Types in an ArrayList
     * @return (ArrayList)listType
     */
    public ArrayList<ExpenseType> getListType()
    {
        ExpenseTypeRepository repo = Persistence.PersistenceFactory.instance().buildRepositoryFactory().getExpenseTypeRepo();
        List<ExpenseType> listType;
        listType = repo.getListOfTypes();        
        return (ArrayList)listType;
    }
    
    /**
     * Returns a specific object of Expense Type after receiving the position in the ArrayList
     * @param posExpenseType
     * @return expenseType
     */
    public ExpenseType getObjectType(int posExpenseType)
    {
        ExpenseTypeRepository repo = Persistence.PersistenceFactory.instance().buildRepositoryFactory().getExpenseTypeRepo();
        ExpenseType expenseType = repo.getExpType(posExpenseType);
        return expenseType;
    }
    
    /**
     * Returns the full list of Payment Means in an ArrayList
     * @return (ArrayList)paymentList
     */
    public ArrayList<PaymentMean> getListPaymentMean()
    {
        IMPaymentMeanRepository repo = new IMPaymentMeanRepository();
        List<PaymentMean> paymentList;
        paymentList = repo.getPaymentMeans();
        return (ArrayList)paymentList;
    }
    
    /**
     * Returns a specific object of Payment Mean after receiving the position in the ArrayList
     * @param posPaymentMean
     * @return paymentMean
     */
    public PaymentMean getPaymentMean(int posPaymentMean)
    {
        IMPaymentMeanRepository repo = new IMPaymentMeanRepository();
        PaymentMean paymentMean = repo.getPaymentMeanIndex(posPaymentMean);
        return paymentMean;
    }    
}
