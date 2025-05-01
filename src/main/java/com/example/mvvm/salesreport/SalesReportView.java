package com.example.mvvm.salesreport;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reportes")
@CrossOrigin(origins = "*")
public class SalesReportView {

    private final SalesReportViewModel viewModel;

    public SalesReportView(SalesReportRepository repository) {
        this.viewModel = new SalesReportViewModel(repository); // Ya no usas `new SalesReportRepository()`
    }

    @GetMapping
    public List<SalesReportDTO> getSalesReport(@RequestParam String date) {
        return viewModel.getReportForDate(date);
    }
}
