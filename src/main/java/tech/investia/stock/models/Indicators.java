package tech.investia.stock.models;

import java.util.List;

public class Indicators {
    private List<Quote> quote;
    private List<Adjclose> adjclose;

    public List<Quote> getQuote() { return quote; }
    public void setQuote(List<Quote> value) { this.quote = value; }

    public List<Adjclose> getAdjclose() { return adjclose; }
    public void setAdjclose(List<Adjclose> value) { this.adjclose = value; }
}
