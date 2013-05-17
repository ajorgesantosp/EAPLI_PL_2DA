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
public interface IPaymentMeanRepository {
    PaymentMean save(PaymentMean mean);
    List getPaymentMeans();
    PaymentMean getPaymentMeanIndex(int index);
    void showPaymentMeans();
}
