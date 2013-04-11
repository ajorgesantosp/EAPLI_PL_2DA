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

   /**
    * Gets the description of this ExpenseType
    *
    * @return the description
    * @deprecated change to getDescription()
    */
   @Deprecated
   public String getExpType() {
      return getDescription();
   }

   /**
    * Sets the description of this ExpenseType
    *
    * @param description the new description
    * @deprecated change to setDescription(string)
    */
   @Deprecated
   public void setExpType(String expType) {
      setDescription(expType);
   }
}
