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
public class ExpenseRegisterController {

    public ExpenseRegisterController() {
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
        ExpenseTypeRepository repo = new ExpenseTypeRepository();
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
        ExpenseTypeRepository repo = new ExpenseTypeRepository();
        ExpenseType expenseType = repo.getExpType(posExpenseType);
        return expenseType;
    }
    
    /**
     * Returns the full list of Payment Means in an ArrayList
     * @return (ArrayList)paymentList
     */
    public ArrayList<PaymentMean> getListPaymentMean()
    {
        PaymentMeanRepository repo = new PaymentMeanRepository();
        List<PaymentMean> paymentList;
        paymentList = repo.;
        return (ArrayList)paymentList;
    }
    
    /**
     * Returns a specific object of Payment Mean after receiving the position in the ArrayList
     * @param posPaymentMean
     * @return paymentMean
     */
    public PaymentMean getPaymentMean(int posPaymentMean)
    {
        PaymentMeanRepository repo = new PaymentMeanRepository();
        PaymentMean paymentMean = repo.;
        return paymentMean;
    }    
}
