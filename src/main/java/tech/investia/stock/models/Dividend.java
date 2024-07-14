package tech.investia.stock.models;

public class Dividend {
    private double amount;
    private long date;

    public double getAmount() { return amount; }
    public void setAmount(double value) { this.amount = value; }

    public long getDate() { return date; }
    public void setDate(long value) { this.date = value; }
}
