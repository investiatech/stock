package tech.investia.stock.models;

public class Post {
    private String timezone;
    private long end;
    private long start;
    private long gmtoffset;

    public String getTimezone() { return timezone; }
    public void setTimezone(String value) { this.timezone = value; }

    public long getEnd() { return end; }
    public void setEnd(long value) { this.end = value; }

    public long getStart() { return start; }
    public void setStart(long value) { this.start = value; }

    public long getGmtoffset() { return gmtoffset; }
    public void setGmtoffset(long value) { this.gmtoffset = value; }
}