package com.example.warehouse.service.documentservice;

import com.example.warehouse.entity.Document;
import com.example.warehouse.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentService implements IDocumentService {

    @Autowired
    private DocumentRepository documentRepository;

    @Override
    public Iterable<Document> findAll() {
        return documentRepository.findAll();
    }

}
