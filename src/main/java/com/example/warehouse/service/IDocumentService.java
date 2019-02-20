package com.example.warehouse.service;

import com.example.warehouse.entity.Document;

public interface IDocumentService {
    Iterable<Document> findAll();
}
