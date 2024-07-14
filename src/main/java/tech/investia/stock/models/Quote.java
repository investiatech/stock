package tech.investia.stock.models;

import java.util.List;

public class Quote {
    private List<Double> open;
    private List<Double> close;
    private List<Double> high;
    private List<Long> volume;
    private List<Double> low;

    public List<Double> getOpen() { return open; }
    public void setOpen(List<Double> value) { this.open = value; }

    public List<Double> getClose() { return close; }
    public void setClose(List<Double> value) { this.close = value; }

    public List<Double> getHigh() { return high; }
    public void setHigh(List<Double> value) { this.high = value; }

    public List<Long> getVolume() { return volume; }
    public void setVolume(List<Long> value) { this.volume = value; }

    public List<Double> getLow() { return low; }
    public void setLow(List<Double> value) { this.low = value; }
}
