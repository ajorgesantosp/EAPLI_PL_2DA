/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;

/**
 *
 * @author PIPOKID & noobshark
 */
public class TypeTotalExpense {
    private ExpenseType type;
    private BigDecimal value;
    
    public TypeTotalExpense(){
        
    }
    
    public TypeTotalExpense(ExpenseType type, BigDecimal value){
        this.type=type;
        this.value=value;
    }
    
    public ExpenseType getType(){ return type;}
    public BigDecimal getValue(){ return value;}
    
    public void setType(ExpenseType type){ this.type=type;}
    public void setValue(BigDecimal value){ this.value=value;}
}
