package com.example.warehouse.dto;

import com.example.warehouse.entity.Item;

import java.time.OffsetDateTime;

public class ChartRangeItemDTO {
    private Item item;
    private OffsetDateTime dateTime;
    private double price = 0;

    public ChartRangeItemDTO() {
    }

    public ChartRangeItemDTO(Item item, OffsetDateTime dateTime, double price) {
        this.item = item;
        this.price = price;
        this.dateTime = dateTime;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public OffsetDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "ChartRangeItemDTO{" +
                "item=" + item +
                ", dateTime=" + dateTime +
                ", price=" + price +
                '}';
    }
}
