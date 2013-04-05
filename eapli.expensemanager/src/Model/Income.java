package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Date;
import sun.util.calendar.CalendarDate;

/**
 *
 * @author RitaNogueira & gilmfc
 */
public class Income {

    private String description;
    private Date date;
    BigDecimal amount;
    private IncomeType type;

    protected Income() {
    }

    public Income(String description, Date dateOccurred, BigDecimal amount,
            IncomeType type) {
        if (description == null || dateOccurred == null || amount == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() == 0) {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.date = dateOccurred;
        this.amount = amount;
        this.type = type;
    }

    public Income(String description, int year, int month, int day, BigDecimal amount, IncomeType type) {
        this(description, DateTime.newDate(year, month, day), amount, type);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public CalendarDate getCalendarDate() {
        CalendarDate data = null;
        data.setDayOfMonth(getDate().getDay());
        data.setMonth(getDate().getMonth());
        data.setYear(getDate().getYear());
        return data;
    }

    public String getDescription() {
        return description;
    }

    public IncomeType getIncomeType() {
        return type;
    }
}
