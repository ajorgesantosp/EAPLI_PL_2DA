package Model;

import javax.persistence.Entity;

/**
 * This class represents cash.
 *
 * @author gilfmc & RitaNogueira
 */
@Entity
public class Cash extends PaymentMean {

   public Cash() {
   }
      
   public Cash(int id, PaymentType type, String description) {
      super(id, type, description);
   }
   
   @Deprecated
   public Cash(PaymentType type, String description) {
      super(-1, PaymentType.Cash, description);
   }
}
