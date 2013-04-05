package Model;

/**
 * This class represents an income type. Income class depends on IncomeType
 *
 * @author gilmfc & RitaNogueira
 */
public class IncomeType {

    private String description;

    public IncomeType(String description) {
        this.description = description;
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
     * @param description the new description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
