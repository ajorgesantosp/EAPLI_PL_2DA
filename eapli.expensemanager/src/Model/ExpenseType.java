package Model;

/**
 * This class represents an expense type. Expense class depends on ExpenseType
 *
 * @author 1110119/1110285 (artur-kk / kameluh)
 */
public class ExpenseType {
   
   private String description;
   private static int cont=0;
   private int id;
   
   
   public ExpenseType(String description) {
      setDescription(description);
      setId();
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
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the description of this ExpenseType
     * 
     */
    private void setId() {
        cont++;
        this.id=cont;
    }
    
    public String toString(){
        return "Expense Type:\nDescription: "+getDescription()+"\nID: "+getId()+"\n";
    }
}
