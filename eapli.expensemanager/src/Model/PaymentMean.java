package Model;

/**
 * Represents a payment mean. Expense depends on a PaymentMean child class
 *
 * @author i110156 + gilfmc & RitaNogueira
 */
public abstract class PaymentMean extends BaseType {
   private PaymentType type;

   public PaymentMean(int id, PaymentType type, String description) {
      super(id, description);
      this.type = type;
   }

   /**
    * Gets the type of this PaymentMean
    *
    * @return the type
    */
   public PaymentType getTypeDescription() {
      return type;
   }
}
