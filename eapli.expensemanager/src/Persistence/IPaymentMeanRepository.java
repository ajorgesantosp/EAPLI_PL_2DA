/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.PaymentMean;
import java.util.List;

/**
 *
 * @author i110156
 */
public interface IPaymentMeanRepository implements Repository<PaymentMean, int>{
    PaymentMean save(PaymentMean mean);
    List all();
    PaymentMean findById(int index);
    void showPaymentMeans();
}
