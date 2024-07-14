package tech.investia.stock.models;

public class Split {
    private long date;
    private long numerator;
    private long denominator;
    private String splitRatio;

    public long getDate() { return date; }
    public void setDate(long value) { this.date = value; }

    public long getNumerator() { return numerator; }
    public void setNumerator(long value) { this.numerator = value; }

    public long getDenominator() { return denominator; }
    public void setDenominator(long value) { this.denominator = value; }

    public String getSplitRatio() { return splitRatio; }
    public void setSplitRatio(String value) { this.splitRatio = value; }
}
