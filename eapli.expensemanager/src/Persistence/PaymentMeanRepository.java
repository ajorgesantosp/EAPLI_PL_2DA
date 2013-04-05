/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.PaymentMean;
import Model.PaymentType;
import java.util.ArrayList;

/**
 *
 * @author i110156
 */
public class PaymentMeanRepository {
    
  private static ArrayList<PaymentMean> listMean = new ArrayList<PaymentMean>();

    public PaymentMeanRepository() {
    }

    public void save(PaymentMean mean) {
        if (mean == null) {
            throw new IllegalArgumentException();
        }
        listMean.add(mean);
    }

    
}
