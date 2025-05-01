package com.example.mvvm.salesreport;

import com.example.mvvm.sale.Sale;

import java.util.List;
import java.util.stream.Collectors;

public class SalesReportViewModel {

    private final SalesReportRepository repository;

    public SalesReportViewModel(SalesReportRepository repository) {
        this.repository = repository;
    }

    public List<SalesReportDTO> getReportForDate(String date) {
        List<Sale> sales = repository.findSalesByDate(date);
        return sales.stream().map(sale ->
            new SalesReportDTO(
                sale.getClient().getName(),
                sale.getProduct().getName(),
                sale.getTotalPrice()
            )
        ).collect(Collectors.toList());
    }   
}
