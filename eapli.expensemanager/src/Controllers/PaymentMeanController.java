/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.PaymentMean;
import Model.PaymentType;
import Persistence.PaymentMeanRepository;

/**
 *
 * @author i110156
 */
public class PaymentMeanController {

    public PaymentMeanController() {
    }

    public void RegisterPaymentMean(PaymentType type, String descricao) {
        switch(type){
            case Cash:
                
//                PaymentMean mean = new PaymentMean(descricao);
//                PaymentMeanRepository repository = new PaymentMeanRepository();
                break;
            case Check:
                
                break;
            case CreditCard:
                
                break;
            case DebitCard:
                
                break;
        }
//        repository.save(mean);
    }
}
