package com.example.warehouse.service.itemservice;

import com.example.warehouse.entity.Item;

public interface IItemService {
    Iterable<Item> findAll();

    Item findById(int id);
}
