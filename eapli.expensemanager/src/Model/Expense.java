/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Date;
import sun.util.calendar.CalendarDate;


/**
 *
 * @author Paulo Gandra Sousa
 */

public class Expense {
    
    private String description;
    private Date date;
    BigDecimal amount;
    private ExpenseType type;
    private PaymentMean paymentMean;
    
    protected Expense() {}
    
    public Expense( String description, Date dateOccurred, BigDecimal amount,
            ExpenseType type, PaymentMean paymentMean) {
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
        this.paymentMean = paymentMean;
    }
    
    public Expense( String description, int year, int month, int day, BigDecimal
            amount, ExpenseType type, PaymentMean paymentMean) {
        this( description, DateTime.newDate(year, month, day), amount, type, paymentMean);
    }
    
    public BigDecimal getAmount() {
        return amount;
    }
    
    public PaymentMean getPaymentMean()
    {
        return paymentMean;
    }

    public Date getDate() {
        return date;
    }  
    
    public CalendarDate getCalendarDate(){
        CalendarDate data=null;
        data.setDayOfMonth(getDate().getDay());
        data.setMonth(getDate().getMonth());
        data.setYear(getDate().getYear());
        return data;
    }

    public String getDescription() {
        return description;
    }

    public ExpenseType getExpenseType() {
        return type;
    }
}
