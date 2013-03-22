/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Date;


/**
 *
 * @author Paulo Gandra Sousa
 */

public class Expense {
    
    private String description;
    private Date date;
    BigDecimal amount;
    private ExpenseType type;
    
    protected Expense() {}
    
    public Expense( String description, Date dateOccurred, BigDecimal amount,
            ExpenseType type) {
        if (description == null || dateOccurred == null || amount == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() ==  0) {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.date = dateOccurred;
        this.amount = amount;
        this.type = type;
    }
    
    public Expense( String description, int year, int month, int day, BigDecimal
            amount, ExpenseType type) {
        this( description, DateTime.newDate(year, month, day), amount, type);
    }
    
    public BigDecimal getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }  

    public String getDescription() {
        return description;
    }

    public ExpenseType getExpenseType() {
        return type;
    }
}
