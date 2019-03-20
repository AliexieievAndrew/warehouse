package com.example.warehouse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DetailDTO {

    @JsonProperty("item")
    private String item;
    @JsonProperty("debit")
    private int debit;

    @JsonProperty("credit")
    private int credit;

    @JsonProperty("price")
    private double price;


    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "DetailDTO{" +
                "item='" + item + '\'' +
                ", debit=" + debit +
                ", credit=" + credit +
                ", price=" + price +
                '}';
    }
}
