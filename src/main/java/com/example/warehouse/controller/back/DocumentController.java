package com.example.warehouse.controller.back;

import com.example.warehouse.dto.DetailDTO;
import com.example.warehouse.entity.Detail;
import com.example.warehouse.entity.Document;
import com.example.warehouse.service.documentservice.IDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/documents")
public class DocumentController {

    @Autowired
    private IDocumentService documentService;

    @GetMapping("/findAll")
    public Iterable<Document> findAll() {
        return documentService.findAll();
    }

    @GetMapping("/incomeInvoices")
    public Iterable<Document> findAllIncomeInvoices() {
        return documentService.findAllByDocumentTypeId(1);
    }

    @GetMapping("/outcomeInvoices")
    public Iterable<Document> findAllOutcomeInvoices() {
        return documentService.findAllByDocumentTypeId(2);
    }

    @GetMapping("/document/{id}")
    public Set<Detail> getById(@PathVariable("id") int id) {
        return documentService.getById(id).getDetails();
    }

    @PostMapping("/document/create/incomeinvoice")
    public void createIncomeInvoice(@RequestBody List<DetailDTO> details) {
        documentService.createIncomeInvoice(details);
    }

    @PostMapping("/document/create/outcomeinvoice")
    public void createOutcomeInvoice(@RequestBody List<DetailDTO> details) {
        documentService.createOutcomeInvoice(details);
    }
}
