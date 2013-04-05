/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.PaymentMeanController;
import Model.PaymentMean;
import java.util.Scanner;

/**
 *
 * @author Joao
 */
public class RegisterPaymentMeanUI {

    public RegisterPaymentMeanUI() {
    }

    public void doShow() {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o meio de pagamento:");
        String descricao = in.nextLine();

        PaymentMeanController pmc = new PaymentMeanController();
        pmc.RegisterPaymentMean(descricao);

    }
}
