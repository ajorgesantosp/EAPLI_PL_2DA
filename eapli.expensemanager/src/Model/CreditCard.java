package Model;

/**
 * This class represents a credit card and is a child of Card class.
 *
 * @author gilfmc & RitaNogueira
 */
public class CreditCard extends Card {
   public CreditCard(PaymentType type, String description, int number) {
      super(PaymentType.CreditCard, description, number);
   }
}
