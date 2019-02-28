package com.example.warehouse.service.documentservice;

import com.example.warehouse.entity.Document;
import com.example.warehouse.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService implements IDocumentService {

    @Autowired
    private DocumentRepository documentRepository;

    @Override
    public Iterable<Document> findAll() {
        return documentRepository.findAll();
    }

    @Override
    public Document getById(int id) {
        return documentRepository.findById(id);
    }

    @Override
    public Iterable<Document> findAllByDocumentTypeId(int id){
        return documentRepository.findAllByDocumentTypeId(id);
    }

    @Override
    public double calcDebitByDocument(Document document){
        return document
                .getDetails()
                .stream()
                .mapToInt(detail -> detail.getDebit())
                .sum();
    }

    @Override
    public double calcCreditByDocument(Document document){
        return document
                .getDetails()
                .stream()
                .mapToInt(detail -> detail.getCredit())
                .sum();
    }

    @Override
    public double calcTotalPrice(Document document) {
        if(document.getDocumentType().equals("outcome invoice"))
            return 0;

        return document
                .getDetails()
                .stream()
                .mapToDouble(detail -> detail.getPrice() * detail.getDebit())
                .sum();
    }
}
