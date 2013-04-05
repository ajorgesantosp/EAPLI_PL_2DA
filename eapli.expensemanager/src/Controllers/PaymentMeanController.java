/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.PaymentMean;
import Persistence.PaymentMeanRepository;

/**
 *
 * @author i110156
 */
public class PaymentMeanController {

    public PaymentMeanController() {
    }

    public void RegisterPaymentMean(String descricao) {

        PaymentMean mean = new PaymentMean(descricao);
        PaymentMeanRepository repository = new PaymentMeanRepository();
        repository.save(mean);
    }
}
