package Model;

/**
 * This class represents a cash payment mean.
 *
 * @author gilfmc & RitaNogueira
 */
public class Cash extends PaymentMean {
   public Cash(PaymentType type, String description) {
      super(PaymentType.Cash, description);
   }
}
