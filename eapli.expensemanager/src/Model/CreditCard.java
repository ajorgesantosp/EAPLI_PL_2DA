package Model;

import javax.persistence.Entity;

/**
 * This class represents a credit card and is a child of Card class.
 *
 * @author gilfmc & RitaNogueira
 */
@Entity
public class CreditCard extends Card {
   public CreditCard() {
   }

   public CreditCard(String description, int number) {
      super(PaymentType.CreditCard, description, number);
   }
}
