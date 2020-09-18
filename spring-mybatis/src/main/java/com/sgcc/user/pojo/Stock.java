package com.sgcc.user.pojo;

public class Stock {

    private int stockid;
    private String name;
    private Integer count;

    public Stock() {
        super();
    }

    public Stock(int stockid, String name, Integer count) {
        super();
        this.stockid = stockid;
        this.name = name;
        this.count = count;
    }

    public int getStockid() {
        return stockid;
    }

    public void setStockid(int stockid) {
        this.stockid = stockid;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }

}
