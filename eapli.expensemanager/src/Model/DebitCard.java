package Model;

import javax.persistence.Entity;

/**
 * This class represents a debit card and is a child of Card class.
 *
 * @author gilfmc & RitaNogueira
 */
@Entity
public class DebitCard extends Card {
   public DebitCard() {
   }
   
   public DebitCard(String description, int number) {
      super(PaymentType.DebitCard, description, number);
   }
}
