/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.PaymentMean;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author i110156
 */
public class PaymentMeanRepository {
    
  private static List<PaymentMean> listMean = new ArrayList<PaymentMean>();

    public PaymentMeanRepository() {
    }

    public void save(PaymentMean mean) {
        if (mean == null) {
            throw new IllegalArgumentException();
        }
        listMean.add(mean);
    }

    public List getPaymentMeans(){
        return listMean;
    }
}
