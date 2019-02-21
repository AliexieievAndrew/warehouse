package com.example.warehouse.controller;

import com.example.warehouse.entity.Detail;
import com.example.warehouse.entity.Document;
import com.example.warehouse.service.IDetailService;
import com.example.warehouse.service.IDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/documents")
public class DocumentController {

    @Autowired
    private IDocumentService documentService;

    @Autowired
    private IDetailService detailService;

    // /documents/findAll
    @GetMapping("/findAll")
    public Iterable<Document> findAll () {
        return documentService.findAll();
    }

    // /documents/findAllDetails
    @GetMapping("/findAllDetails")
    public Iterable<Detail> findAllDetails() {
        return detailService.findAll();
    }
}
