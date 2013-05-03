package Model;

import javax.persistence.Entity;

/**
 * This class represents an expense type. Expense class depends on ExpenseType
 *
 * @author 1110119/1110285 (artur-kk / kameluh) + gilfmc & RitaNogueira
 */
@Entity
public class ExpenseType extends BaseType {
   public static int NEXT_ID = 1;

   public ExpenseType() {
      super(NEXT_ID++);
   }

   public ExpenseType(int id, String description) {
      super(NEXT_ID++, description);
   }

   public ExpenseType(ExpenseType eT) {
      super(eT);
   }

   @Override
   public String toString() {
      return "ExpenseType:\n" + super.toString() + ";";
   }

   @Override
   public boolean equals(Object o) {
      return ((ExpenseType) o).getId() == getId();
   }
}
