package Model;

/**
 * This class represents an income type. Income class depends on IncomeType
 *
 * @author gilmfc & RitaNogueira
 */
public class IncomeType extends BaseType {
   public static int NEXT_ID = 1;
   
   public IncomeType(String description) {
      super(NEXT_ID++, description);
   }

   public IncomeType(IncomeType incomeType) {
      super(incomeType);
   }
}
