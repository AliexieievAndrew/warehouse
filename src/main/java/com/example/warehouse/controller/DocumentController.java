package com.example.warehouse.controller;

import com.example.warehouse.entity.Document;
import com.example.warehouse.service.IDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/documents")
public class DocumentController {

    @Autowired
    private IDocumentService documentService;

    // /documents/findAll
    @GetMapping("/findAll")
    public Iterable<Document> findAll () {
        return documentService.findAll();
    }
}
