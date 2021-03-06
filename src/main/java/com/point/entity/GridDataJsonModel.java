package com.point.entity;

import java.util.List;

public class GridDataJsonModel<T> {
    private String status;
    private Integer totals;
    private List<T> Data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTotals() {
        return totals;
    }

    public void setTotals(Integer totals) {
        this.totals = totals;
    }

    public List<T> getData() {
        return Data;
    }

    public void setData(List<T> data) {
        Data = data;
    }
}
