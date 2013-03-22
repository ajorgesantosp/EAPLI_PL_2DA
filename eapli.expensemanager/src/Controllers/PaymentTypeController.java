/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.PaymentType;
import Persistence.PaymentTypeRepository;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Joao
 */
public class PaymentTypeController {

    public PaymentTypeController() {
    }

    public void registerType(String what) {
        PaymentType type = new PaymentType(what);
        PaymentTypeRepository repo = new PaymentTypeRepository();
        repo.save(type);
    }

    public int showPaymentTypes() {
        PaymentTypeRepository repo = new PaymentTypeRepository();
        return repo.showPaymentTypes();
    }

    public void createExpenseWithPaymentType(String description, Date dateOccurred, BigDecimal amount, PaymentType type) {
        //Expense exp = new Expense(description, dateOccurred, amount, type);
        // nao esta acabado falta colocar o tipo de pagamento na despesa
    }
}
