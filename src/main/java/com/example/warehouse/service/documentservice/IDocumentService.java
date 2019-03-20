package com.example.warehouse.service.documentservice;

import com.example.warehouse.dto.DetailDTO;
import com.example.warehouse.entity.Document;

import java.util.List;

public interface IDocumentService {
    Iterable<Document> findAll();

    Document getById(int id);

    Iterable<Document> findAllByDocumentTypeId(int id);

    double calcDebitByDocument(Document document);

    double calcCreditByDocument(Document document);

    double calcTotalPrice(Document document);

    void createIncomeInvoice(List<DetailDTO> details);

    void createOutcomeInvoice(List<DetailDTO> details);
}
