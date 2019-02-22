package com.example.warehouse.repository;

import com.example.warehouse.entity.Document;
import org.springframework.data.repository.CrudRepository;

public interface DocumentRepository extends CrudRepository<Document,Integer> {
    Document findById(int id);
}
