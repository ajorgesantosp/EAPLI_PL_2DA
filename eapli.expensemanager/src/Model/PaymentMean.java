/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author i110156
 */
public class PaymentMean {
   
    private String descricao;
    
    public PaymentMean(String descricao){
        
        this.descricao=descricao;
    }
    
    
    public String toString(){
        
        return descricao;
    }
}
