package com.example.warehouse.repository;

import com.example.warehouse.entity.Document;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DocumentRepository extends CrudRepository<Document,Integer> {
    Document findById(int id);
    Iterable<Document> findAllByDocumentTypeId(int id);
}
