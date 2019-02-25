package com.example.warehouse.service.documenttypeservice;

import com.example.warehouse.entity.DocumentType;
import com.example.warehouse.repository.DocumentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DocumentTypeService implements IDocumentTypeService{

    @Autowired
    DocumentTypeRepository documentTypeRepository;

    @Override
    public Iterable<DocumentType> findAll() {
        return documentTypeRepository.findAll();
    }

    @Override
    public DocumentType save(DocumentType documentType){
        return documentTypeRepository.save(documentType);
    }
}
