package com.example.warehouse.service.documenttypeservice;

import com.example.warehouse.entity.DocumentType;

public interface IDocumentTypeService {
    Iterable<DocumentType> findAll();
}
