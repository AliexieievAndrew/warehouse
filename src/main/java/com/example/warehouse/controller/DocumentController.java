package com.example.warehouse.controller;

import com.example.warehouse.entity.Document;
import com.example.warehouse.service.documentservice.IDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/documents")
public class DocumentController {

    @Autowired
    private IDocumentService documentService;

    @GetMapping("/findAll")
    public Iterable<Document> findAll () {
        return documentService.findAll();
    }

    @GetMapping("/incomeInvoices")
    public Iterable <Document> findAllIncomeInvoices() {
        return documentService.findAllByDocumentTypeId(1);
    }

    @GetMapping("/outcomeInvoices")
    public Iterable <Document> findAllOutcomeInvoices() {
        return documentService.findAllByDocumentTypeId(2);
    }
}
