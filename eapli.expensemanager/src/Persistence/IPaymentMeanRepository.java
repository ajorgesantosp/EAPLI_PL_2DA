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
public abstract interface IPaymentMeanRepository {
    public void save(PaymentMean mean);
    public List getPaymentMeans();
    public PaymentMean getPaymentMeanIndex(int index);
    public void showPaymentMeans();
}
