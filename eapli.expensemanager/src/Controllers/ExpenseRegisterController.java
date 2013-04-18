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
    
    public void registerExpense(String what, Date date, BigDecimal amount, ExpenseType type_pos, PaymentMean paymentMean) {
        Expense expense = new Expense(what, date, amount, type_pos, paymentMean);
        ExpenseRepository repo = new ExpenseRepository();
        repo.save(expense);
    }
    
    public ArrayList<ExpenseType> getListType()
    {
        ExpenseTypeRepository repo = new ExpenseTypeRepository();
        List<ExpenseType> listType;
        listType = repo.getListOfTypes();        
        return (ArrayList)listType;
    }
    
    public ExpenseType getObjectType(int pos_type)
    {
        ExpenseTypeRepository repo = new ExpenseTypeRepository();
        ExpenseType expenseType = repo.getExpType(pos_type);
        return expenseType;
    }
    
    public ArrayList<PaymentMean> getListPaymentMean()
    {
        PaymentMeanRepository repo = new PaymentMeanRepository();
        List<PaymentMean> paymentList;
        paymentList = repo.;
        return (ArrayList)paymentList;
    }
    
    public PaymentMean getPaymentMean(int posPaymentMean)
    {
        PaymentMeanRepository repo = new PaymentMeanRepository();
        PaymentMean paymentMean = repo.;
        return paymentMean;
    }
    
    
    //TODO - obter a lista de tipos de pagamento
    
}
