package com.example.warehouse.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "document_details")
public class Detail {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private int id;

    @JoinColumn(name = "item")
    @ManyToOne(cascade = CascadeType.ALL)
    private Item item;

    @JoinColumn(name = "document")
    @ManyToOne(cascade = CascadeType.ALL)
    @JsonBackReference
    private Document document;

    @Column(name = "debit")
    private int debit;

    @Column(name = "credit")
    private int credit;

    @Column(name = "price")
    private double price = 0;

    @Transient
    @JsonSerialize
    private double total;

    public int getId() {
        return id;
    }

    public double getTotal() {
        return this.price * this.debit;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Detail detail = (Detail) o;
//        return id == detail.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }

    @Override
    public String toString() {
        return "Detail{" +
                "id=" + id +
                ", item=" + item +
                ", document=" + document +
                ", debit=" + debit +
                ", credit=" + credit +
                ", price=" + price +
                ", total=" + total +
                '}';
    }
}
