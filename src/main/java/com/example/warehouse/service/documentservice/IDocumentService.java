package com.example.warehouse.service.documentservice;

import com.example.warehouse.entity.Document;

public interface IDocumentService {
    Iterable<Document> findAll();
}
