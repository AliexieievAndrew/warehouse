package com.example.warehouse.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

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


    public int getId() {
        return id;
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

    @Override
    public String toString() {
        return "Detail{" +
                "id=" + id +
                ", item=" + item +
                ", document=" + document +
                ", debit=" + debit +
                ", credit=" + credit +
                ", price=" + price +
                '}';
    }
}
