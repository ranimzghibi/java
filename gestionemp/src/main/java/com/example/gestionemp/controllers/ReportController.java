package com.example.gestionemp.controllers;

import com.example.gestionemp.models.Report;
import com.example.gestionemp.services.PdfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/reports")
public class ReportController {

    @Autowired
    private PdfService pdfService;

    @PostMapping
    @ResponseBody
    public ResponseEntity<byte[]> createReport(@RequestBody Report report) {
        byte[] pdfBytes = pdfService.generatePdf(report.getContent());

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDispositionFormData("filename", "report.pdf");

        return ResponseEntity.ok()
                .headers(headers)
                .body(pdfBytes);
    }

    @GetMapping
    public String getReportForm() {
        return "employees/rapport";
    }
}


