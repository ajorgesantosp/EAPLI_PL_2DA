package Model;

/**
 * This class is a PaymentMean and represents a card. Instantiate a CreditCard or DebitCard if you want to use this
 * class
 *
 * @author gilfmc & RitaNogueira
 */
public abstract class Card extends PaymentMean {
   private int number;

   public Card(int id, PaymentType type, int number, String description) {
      super(id, type, description);
      setNumber(number);
   }
   
   @Deprecated
   public Card(PaymentType type, String description, int number) {
      super(-1, type, description);
      setNumber(number);
   }

   /**
    * Gets the card number
    *
    * @return the number
    *
    */
   public int getNumber() {
      return number;
   }

   /**
    * Sets the card number
    *
    * @param the new number
    */
   public void setNumber(int number) {
      this.number = number;
   }
}
