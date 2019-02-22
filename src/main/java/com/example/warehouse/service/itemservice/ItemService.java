package com.example.warehouse.service.itemservice;

import com.example.warehouse.entity.Item;
import com.example.warehouse.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ItemService implements IItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Iterable<Item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public Item findById(int id) {
        return itemRepository.findById(id);
    }
}
