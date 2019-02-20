package com.example.warehouse.entity;

import javax.persistence.*;

@Entity
@Table(name = "document_details")
public class Detail {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "item")
    @ManyToOne
    private Item item;

    @Column(name = "document")
    @ManyToOne
    private Document document;

    @Column(name = "debit")
    private int debit;

    @Column(name = "credit")
    private int credit;

    @OneToMany(mappedBy = "detail", cascade = CascadeType.ALL)
    private Price price;

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

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}
