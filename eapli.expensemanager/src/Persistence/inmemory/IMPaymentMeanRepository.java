/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.inmemory;

import Model.PaymentMean;
import Persistence.IPaymentMeanRepository;
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

    @Override
    public PaymentMean save(PaymentMean mean) {
        if (mean == null) {
            throw new IllegalArgumentException();
        }
        listMean.add(mean);
        return mean;
    }

    @Override
    public List all() {
        return listMean;
    }

    @Override
    public PaymentMean findById(int index) {
        return listMean.get(index);
    }
    
    @Override
    public void showPaymentMeans(){
        int size = listMean.size();
        for(int i=0; i<size; i++){
            System.out.println(listMean.get(i));
        }
    }
}
