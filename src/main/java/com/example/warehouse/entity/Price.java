package com.example.warehouse.entity;

import javax.persistence.*;

@Table(name = "price")
public class Price {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @Column(name = "document_details")
    private Detail detail;

    @Column(name = "price")
    private Double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Price{" +
                "id=" + id +
                ", detail=" + detail +
                ", price=" + price +
                '}';
    }
}
