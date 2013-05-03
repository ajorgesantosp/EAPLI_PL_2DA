package Model;

import javax.persistence.Entity;

/**
 * This class represents an income type. Income class depends on IncomeType
 *
 * @author gilmfc & RitaNogueira
 */
@Entity
public class IncomeType extends BaseType {
   public static int NEXT_ID = 1;

   public IncomeType() {
      super(NEXT_ID++);
   }

   public IncomeType(String description) {
      super(NEXT_ID++, description);
   }

   public IncomeType(IncomeType incomeType) {
      super(incomeType);
   }
}
