package com.example.warehouse.service.documentservice;

import com.example.warehouse.entity.Document;

public interface IDocumentService {
    Iterable<Document> findAll();

    Document getById(int id);

    double calcDebitByDocument(Document document);

    double calcCreditByDocument(Document document);

    double calcTotalPrice(Document document);
}
