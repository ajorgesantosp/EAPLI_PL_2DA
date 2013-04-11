package Model;

/**
 * This class represents an income type. Income class depends on IncomeType
 *
 * @author gilmfc & RitaNogueira
 */
public class IncomeType extends BaseType {
   public IncomeType(int id, String description) {
      super(id, description);
   }

   public IncomeType(IncomeType incomeType) {
      super(incomeType);
   }
}
