package Model;

/**
 * This class represents a debit card and is a child of Card class.
 *
 * @author gilfmc & RitaNogueira
 */
public class DebitCard extends Card {
   public DebitCard(String description, int number) {
      super(PaymentType.DebitCard, description, number);
   }
}
