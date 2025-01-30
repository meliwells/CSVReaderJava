package data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.StringJoiner;

public class Record {
    LocalDate date; //LocalDate
    public String category;
    public String Description;
    BigDecimal amount;  //BigDecimal instead of int
    public String paymentMethod;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Record() {
    }

    public Record(LocalDate date, String category, String description, BigDecimal amount, String paymentMethod) {
        this.date = date;
        this.category = category;
        Description = description;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    //create a ToString (look at code along for dates to format) use date formatter to print date as MM-dd-yyyy
    @Override
    public String toString() {
        return "Date: " + date.format(formatter) + "  " + "Category: " + category + " " +
                "Description: " + Description + "  " + "Amount: " + amount + "  " +
                "Payment Method: " + paymentMethod;
    }


}


