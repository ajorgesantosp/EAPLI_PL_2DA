/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.PaymentMeanController;
import Model.PaymentType;
import java.math.BigDecimal;
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
            pmc.RegisterPaymentMean(PaymentType.Check);
        }
        if (tipo.equals("CreditCard")) {
            pmc.RegisterPaymentMean(PaymentType.CreditCard);
        }
        if (tipo.equals("DebitCard")) {
            pmc.RegisterPaymentMean(PaymentType.DebitCard);
        }
        if (tipo.equals("Cash")) {
            pmc.RegisterPaymentMean(PaymentType.Cash);
        }
    }

    public String getActionName() {
        return "Payment Mean Register";
    }

    public void showBalance() {
    }
}
