package Model;

/**
 * This class represents an expense type. Expense class depends on ExpenseType
 *
 * @author 1110119/1110285 (artur-kk / kameluh)
 */
public class ExpenseType {
   
   private String description;
   
   public ExpenseType(String description) {
      setDescription(description);
   }
   
   public ExpenseType(ExpenseType eT) {
      this.description = eT.description;
   }

   /**
    * Gets the description of this ExpenseType
    *
    * @return the description
    */
   public String getDescription() {
      return description;
   }

   /**
    * Sets the description of this ExpenseType
    *
    * @param description the new description
    */
   public void setDescription(String description) {
      if (description == null)
         throw new IllegalArgumentException();
      this.description = description;
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
