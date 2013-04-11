package Model;

/**
 * This class represents an expense type. Expense class depends on ExpenseType
 *
 * @author 1110119/1110285 (artur-kk / kameluh) + gilfmc & RitaNogueira
 */
public class ExpenseType extends BaseType {   
   public ExpenseType(int id, String description) {
      super(id, description);
   }
   
   public ExpenseType(ExpenseType eT) {
      super(eT);
   }
}
