/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.bootstrap;

import Model.Expense;
import Model.PaymentType;
import Persistence.PaymentTypeRepository;
import java.math.BigDecimal;

/**
 *
 * @author Joao
 */
public class PaymentTypeBootstrapper {
    static {
        PaymentTypeRepository repo = new PaymentTypeRepository();
        repo.save(new PaymentType("Money"));
    }
}
