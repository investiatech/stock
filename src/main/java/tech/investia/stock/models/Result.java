package tech.investia.stock.models;

import java.util.List;

public class Result {
    private Meta meta;
    private List<Long> timestamp;
    private Events events;
    private Indicators indicators;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta value) {
        this.meta = value;
    }

    public List<Long> getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(List<Long> value) {
        this.timestamp = value;
    }

    public Events getEvents() {
        return events;
    }

    public void setEvents(Events value) {
        this.events = value;
    }

    public Indicators getIndicators() {
        return indicators;
    }

    public void setIndicators(Indicators value) {
        this.indicators = value;
    }
    
}