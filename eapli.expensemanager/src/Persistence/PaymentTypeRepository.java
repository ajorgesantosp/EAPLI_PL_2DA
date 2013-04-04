/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.*;
import java.util.ArrayList;

/**
 *
 * @author Joao
 */
public class PaymentTypeRepository {

    private static ArrayList<PaymentType> listType = new ArrayList<PaymentType>();

    public PaymentTypeRepository() {
    }

    public void save(PaymentType pay) {
        if (pay == null) {
            throw new IllegalArgumentException();
        }
        listType.add(pay);
    }

    public int showPaymentTypes() {//retorna o tamanho da lista para o menu saber entre que valores pode aceitar
        for (int i = 0; i < listType.size(); i++) {
            System.out.println((i + 1) + " - " + listType.get(i));
        }
        return listType.size();
    }
}
