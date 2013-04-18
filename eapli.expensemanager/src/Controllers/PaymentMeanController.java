/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.*;
import Persistence.*;
import java.math.BigDecimal;
import java.util.List;

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
                mean = new Cash((Integer)args[0], type, (String)args[1]);
//                PaymentMeanRepository repository = new PaymentMeanRepository();
                break;
            case Check:
                mean = new Check((Integer)args[0], type, (BigDecimal)args[2], (String)args[3], (Integer)args[4], (String)args[4]);
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
    
    public List getPaymentMeans(){
        PaymentMeanRepository rep = new PaymentMeanRepository();
        return rep.getPaymentMeans();
    }
}
