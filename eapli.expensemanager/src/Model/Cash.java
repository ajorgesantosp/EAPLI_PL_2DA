package Model;

/**
 * This class represents cash.
 *
 * @author gilfmc & RitaNogueira
 */
public class Cash extends PaymentMean {
   public Cash(int id, PaymentType type, String description) {
      super(id, type, description);
   }
   
   @Deprecated
   public Cash(PaymentType type, String description) {
      super(-1, PaymentType.Cash, description);
   }
}
