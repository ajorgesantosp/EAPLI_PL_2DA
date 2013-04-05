package Model;

import java.math.BigDecimal;

/**
 * This class represents a check.
 *
 * @author gilfmc & RitaNogueira
 */
public class Check extends PaymentMean {
   private int number;
   private BigDecimal amount;
   private String bank;

   public Check(String description, String bank, int number, BigDecimal amount) {
      super(PaymentType.Check, description);
      if (amount.signum() == -1 || amount.signum() == 0)
         throw new IllegalArgumentException();
      this.number = number;
      this.amount = amount;
   }

   /**
    * Gets the bank of this check
    *
    * @return the bank, as a String
    */
   public String getBank() {
      return bank;
   }

   /**
    * Gets the number of this check
    *
    * @return the number
    */
   public int getNumber() {
      return number;
   }

   /**
    * Gets the amount of this check
    *
    * @return the amount
    */
   public BigDecimal getAmount() {
      return amount;
   }
}
