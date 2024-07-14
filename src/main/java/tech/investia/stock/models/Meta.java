package tech.investia.stock.models;

import java.util.List;

public class Meta {
    private String currency;
    private String symbol;
    private String exchangeName;
    private String fullExchangeName;
    private String instrumentType;
    private long firstTradeDate;
    private long regularMarketTime;
    private boolean hasPrePostMarketData;
    private long gmtoffset;
    private String timezone;
    private String exchangeTimezoneName;
    private double regularMarketPrice;
    private double fiftyTwoWeekHigh;
    private double fiftyTwoWeekLow;
    private double regularMarketDayHigh;
    private double regularMarketDayLow;
    private long regularMarketVolume;
    private double chartPreviousClose;
    private long priceHint;
    private CurrentTradingPeriod currentTradingPeriod;
    private String dataGranularity;
    private String range;
    private List<String> validRanges;

    public String getCurrency() { return currency; }
    public void setCurrency(String value) { this.currency = value; }

    public String getSymbol() { return symbol; }
    public void setSymbol(String value) { this.symbol = value; }

    public String getExchangeName() { return exchangeName; }
    public void setExchangeName(String value) { this.exchangeName = value; }

    public String getFullExchangeName() { return fullExchangeName; }
    public void setFullExchangeName(String value) { this.fullExchangeName = value; }

    public String getInstrumentType() { return instrumentType; }
    public void setInstrumentType(String value) { this.instrumentType = value; }

    public long getFirstTradeDate() { return firstTradeDate; }
    public void setFirstTradeDate(long value) { this.firstTradeDate = value; }

    public long getRegularMarketTime() { return regularMarketTime; }
    public void setRegularMarketTime(long value) { this.regularMarketTime = value; }

    public boolean getHasPrePostMarketData() { return hasPrePostMarketData; }
    public void setHasPrePostMarketData(boolean value) { this.hasPrePostMarketData = value; }

    public long getGmtoffset() { return gmtoffset; }
    public void setGmtoffset(long value) { this.gmtoffset = value; }

    public String getTimezone() { return timezone; }
    public void setTimezone(String value) { this.timezone = value; }

    public String getExchangeTimezoneName() { return exchangeTimezoneName; }
    public void setExchangeTimezoneName(String value) { this.exchangeTimezoneName = value; }

    public double getRegularMarketPrice() { return regularMarketPrice; }
    public void setRegularMarketPrice(double value) { this.regularMarketPrice = value; }

    public double getFiftyTwoWeekHigh() { return fiftyTwoWeekHigh; }
    public void setFiftyTwoWeekHigh(double value) { this.fiftyTwoWeekHigh = value; }

    public double getFiftyTwoWeekLow() { return fiftyTwoWeekLow; }
    public void setFiftyTwoWeekLow(double value) { this.fiftyTwoWeekLow = value; }

    public double getRegularMarketDayHigh() { return regularMarketDayHigh; }
    public void setRegularMarketDayHigh(double value) { this.regularMarketDayHigh = value; }

    public double getRegularMarketDayLow() { return regularMarketDayLow; }
    public void setRegularMarketDayLow(double value) { this.regularMarketDayLow = value; }

    public long getRegularMarketVolume() { return regularMarketVolume; }
    public void setRegularMarketVolume(long value) { this.regularMarketVolume = value; }

    public double getChartPreviousClose() { return chartPreviousClose; }
    public void setChartPreviousClose(double value) { this.chartPreviousClose = value; }

    public long getPriceHint() { return priceHint; }
    public void setPriceHint(long value) { this.priceHint = value; }

    public CurrentTradingPeriod getCurrentTradingPeriod() { return currentTradingPeriod; }
    public void setCurrentTradingPeriod(CurrentTradingPeriod value) { this.currentTradingPeriod = value; }

    public String getDataGranularity() { return dataGranularity; }
    public void setDataGranularity(String value) { this.dataGranularity = value; }

    public String getRange() { return range; }
    public void setRange(String value) { this.range = value; }

    public List<String> getValidRanges() { return validRanges; }
    public void setValidRanges(List<String> value) { this.validRanges = value; }
}