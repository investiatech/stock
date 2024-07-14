package tech.investia.stock.models;

import java.util.List;

public class Chart {
    private List<Result> result;
    private Object error;

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> value) {
        this.result = value;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object value) {
        this.error = value;
    }

}
