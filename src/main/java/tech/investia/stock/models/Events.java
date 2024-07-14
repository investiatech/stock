package tech.investia.stock.models;

import java.util.Map;

public class Events {
    private Map<String, Dividend> dividends;
    private Map<String, Split> splits;

    public Map<String, Dividend> getDividends() { return dividends; }
    public void setDividends(Map<String, Dividend> value) { this.dividends = value; }

    public Map<String, Split> getSplits() { return splits; }
    public void setSplits(Map<String, Split> value) { this.splits = value; }
}

