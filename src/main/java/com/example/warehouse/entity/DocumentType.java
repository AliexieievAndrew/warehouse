package com.example.warehouse.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "document_type")
public class DocumentType {

    @Id
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "name")
    private String name;

    @OneToMany(mappedBy = "documentType")
    private Set<Document> documents;

    public Set<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(Set<Document> documents) {
        this.documents = documents;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DocumentType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
