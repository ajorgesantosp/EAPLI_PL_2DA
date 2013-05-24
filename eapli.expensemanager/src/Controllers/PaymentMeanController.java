/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.*;
import Persistence.*;
import Persistence.inmemory.IMPaymentMeanRepository;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author i110156
 */
public class PaymentMeanController extends BaseController{
    
    public PaymentMeanController() {
    }
    
    public void RegisterPaymentMean(PaymentType type, Object... args) {
        PaymentMean mean = null;
        switch (type) {
            case Cash:
                mean = new Cash((Integer) args[0], type, (String) args[1]);
//                IPaymentMeanRepository repository = new IPaymentMeanRepository();
                break;
            case Check:
                mean = new Check((Integer) args[0], type, (BigDecimal) args[2], (String) args[3], (Integer) args[4], (String) args[4]);
                break;
            case CreditCard:
                mean = new CreditCard((String) args[0], (Integer) args[1]);
                break;
            case DebitCard:
                mean = new DebitCard((String) args[0], (Integer) args[1]);
                break;
        }
        IPaymentMeanRepository pay = new IMPaymentMeanRepository();
        pay.save(mean);
    }
    
    public List getPaymentMeans() {
        IPaymentMeanRepository rep = new IMPaymentMeanRepository();
        return rep.all();
    }
    
    public PaymentMean getPaymentMeanIndex(int index) {
        IPaymentMeanRepository rep = new IMPaymentMeanRepository();
        return rep.findById(index);
    }
    
    public void showPaymentMeans(){
        IPaymentMeanRepository rep = new IMPaymentMeanRepository();
        rep.showPaymentMeans();
    }
}
