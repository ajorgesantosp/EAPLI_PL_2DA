/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.PaymentMeanController;
import Model.PaymentMean;
import Model.PaymentType;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Joao
 */
public abstract class RegisterPaymentMeanUI extends BaseUI {

    public RegisterPaymentMeanUI() {
    }

    public void doShow() {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o tipo de pagamento(Cash, Check, CreditCard, DebitCard):");
        String tipo = in.nextLine();

        PaymentMeanController pmc = new PaymentMeanController();
        // fazer switch para cada tipo de pagamento
        if (tipo.equals("Check")) {
            System.out.println("Insert check id:");
            int id = in.nextInt();
            System.out.println("Insert amount:");
            BigDecimal amount = in.nextBigDecimal();
            System.out.println("Insert associated bank:");
            String bank = in.nextLine();
            System.out.println("Insert check number:");
            int number = in.nextInt();
            System.out.println("Insert description:");
            String description = in.nextLine();
            pmc.RegisterPaymentMean(PaymentType.Check, id, amount, bank, number, description);
        }
        if (tipo.equals("CreditCard")) {
            System.out.println("Insert check number:");
            int number = in.nextInt();
            System.out.println("Insert description:");
            String description = in.nextLine();
            pmc.RegisterPaymentMean(PaymentType.CreditCard, description, number);
        }
        if (tipo.equals("DebitCard")) {
            System.out.println("Insert check number:");
            int number = in.nextInt();
            System.out.println("Insert description:");
            String description = in.nextLine();
            pmc.RegisterPaymentMean(PaymentType.DebitCard, description, number);
        }
        if (tipo.equals("Cash")) {
            System.out.println("Insert check id:");
            int id = in.nextInt();
            System.out.println("Insert description:");
            String description = in.nextLine();
            pmc.RegisterPaymentMean(PaymentType.Cash, id, description);
        }
    }

    public String getActionName() {
        return "Payment Mean Register";
    }

    public void showBalance() {
    }

    public List getPaymentMeans() {
        PaymentMeanController pmc = new PaymentMeanController();
        return pmc.getPaymentMeans();
    }

    public PaymentMean getPaymentMeanIndex(int index) {
        PaymentMeanController pmc = new PaymentMeanController();
        return pmc.getPaymentMeanIndex(index);
    }
    
    public void showPaymentMeans(){
        PaymentMeanController pmc = new PaymentMeanController();
        pmc.showPaymentMeans();
    }
}
