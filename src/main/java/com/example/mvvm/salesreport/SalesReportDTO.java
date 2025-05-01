package com.example.mvvm.salesreport;

public class SalesReportDTO {
    private String buyername;
    private String productname;
    private double total;

    public SalesReportDTO(String buyername, String productname, double total) {
        this.buyername = buyername;
        this.productname = productname;
        this.total = total;
    }

    public String getBuyername() {
        return buyername;
    }

    public void setBuyername(String buyername) {
        this.buyername = buyername;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
