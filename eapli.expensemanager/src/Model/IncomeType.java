package Model;

/**
 * This class represents an income type. Income class depends on IncomeType
 *
 * @author gilmfc & RitaNogueira
 */
public class IncomeType {

   private String description;

   public IncomeType(String description) {
      setDescription(description);
   }

   public IncomeType(IncomeType incomeType) {
      this.description = incomeType.description;
   }

   /**
    * Gets the description of this IncomeType
    *
    * @return the description
    */
   public String getDescription() {
      return description;
   }

   /**
    * Sets the description of this IncomeType
    *
    * @param description the new description private String description; private Date date; BigDecimal amount; private
    * ExpenseType type;
    */
   public void setDescription(String description) {
      if (description == null)
         throw new IllegalArgumentException();
      this.description = description;
   }
}
