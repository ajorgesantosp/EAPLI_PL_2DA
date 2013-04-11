/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.*;
import Persistence.*;
import java.math.BigDecimal;

/**
 *
 * @author i110156
 */
public class PaymentMeanController {

    public PaymentMeanController() {
    }

    public void RegisterPaymentMean(PaymentType type, Object... args) {
        PaymentMean mean = null;
        switch(type){
            case Cash:
                
                mean = new Cash(type, (String)args[0]);
//                PaymentMeanRepository repository = new PaymentMeanRepository();
                break;
            case Check:
                mean = new Check((String)args[0], (String)args[1], (Integer)args[2], (BigDecimal)args[3]);
                break;
            case CreditCard:
                mean = new CreditCard((String)args[0], (Integer)args[1]);
                break;
            case DebitCard: 
                mean = new DebitCard((String)args[0], (Integer)args[1]);
                break;
        }
        PaymentMeanRepository pay = new PaymentMeanRepository();
        pay.save(mean);
    }
}
