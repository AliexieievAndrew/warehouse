package com.example.warehouse.repository;

import com.example.warehouse.entity.DocumentType;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DocumentTypeRepository extends CrudRepository<DocumentType,Integer> {
    DocumentType findById(int id);
}
