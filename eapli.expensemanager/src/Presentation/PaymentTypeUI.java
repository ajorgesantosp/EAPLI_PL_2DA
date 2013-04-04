/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.PaymentTypeController;
import java.util.Scanner;

/**
 *
 * @author Joao
 */
public class PaymentTypeUI {

    public void mainLoop() {
        Scanner in = new Scanner(System.in);
        PaymentTypeController pay = new PaymentTypeController();
        int size;
        int answer;
        do {
            System.out.println("* * *  CHOOSE A PAYMENT TYPE  * * *\n");
            size = pay.showPaymentTypes();
            answer = in.nextInt();
        } while (answer < 0 || answer > size);
        
    }
}
