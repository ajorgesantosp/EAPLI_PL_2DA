/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author 1110119/1110285 (artur-kk / kameluh)
 */
public class ExpenseType {
    private String expType;

    public ExpenseType(String expType) {
        this.expType=expType;
    }
    
    public ExpenseType(ExpenseType eT){
        this.expType=eT.getExpType();
    }

    /**
     * @return the expType
     */
    public String getExpType() {
        return expType;
    }

    /**
     * @param expType the expType to set
     */
    public void setExpType(String expType) {
        this.expType = expType;
    }
}
