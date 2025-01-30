package data;

public class Record {
    public int date;
    public String category;
    public String Description;
    public int amount;
    public String paymentMethod;

    public Record() {
    }

    public Record(int date, String category, String description, int amount, String paymentMethod) {
        this.date = date;
        this.category = category;
        Description = description;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
