package Model;

/**
 * Represents a way of payment.This class is important in 
 * @author i110156
 */
public class PaymentMean {
   
    private String description;
    
    public PaymentMean(String description){
        
        this.description=description;
    }
    
    
    public String toString(){
        
        return getDescription();
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
