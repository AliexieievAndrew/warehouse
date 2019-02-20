package com.example.warehouse.entity;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Set;

@Entity
@Table (name = "document")
public class Document {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "date")
    private OffsetDateTime date;

    @Column(name = "document_type")

    @ManyToOne
    private DocumentType documentType;

    @OneToMany(mappedBy = "document")
    private Set<Detail> details;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public Set<Detail> getDetails() {
        return details;
    }

    public void setDetails(Set<Detail> details) {
        this.details = details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return id == document.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", date=" + date +
                ", documentType=" + documentType +
                '}';
    }
}
