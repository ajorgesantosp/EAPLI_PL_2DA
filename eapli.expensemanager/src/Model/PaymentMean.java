package Model;

/**
 * Represents a payment mean. Expense depends on a PaymentMean child class
 *
 * @author i110156 + gilfmc & RitaNogueira
 */
public abstract class PaymentMean {
   private PaymentType type;
   private String description;

   public PaymentMean(PaymentType type, String description) {
      this.type = type;
      setDescription(description);
   }

   public String toString() {
      return getDescription();
   }

   /**
    * Gets the description of this PaymentMean
    *
    * @return the description
    */
   public String getDescription() {
      return description;
   }

   /**
    * Sets the description of this PaymentMean
    *
    * @param description the new description
    */
   public void setDescription(String description) {
      if (description == null)
         throw new IllegalArgumentException();
      this.description = description;
   }
}
