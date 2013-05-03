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
 * @author Joao
 */
public class IMPaymentMeanRepository implements IPaymentMeanRepository{
    private static List<PaymentMean> listMean = new ArrayList<PaymentMean>();

    public IMPaymentMeanRepository() {
    }

    public void save(PaymentMean mean) {
        if (mean == null) {
            throw new IllegalArgumentException();
        }
        listMean.add(mean);
    }

    public List getPaymentMeans() {
        return listMean;
    }

    public PaymentMean getPaymentMeanIndex(int index) {
        return listMean.get(index);
    }
    
    public void showPaymentMeans(){
        int size = listMean.size();
        for(int i=0; i<size; i++){
            System.out.println(listMean.get(i));
        }
    }
}
