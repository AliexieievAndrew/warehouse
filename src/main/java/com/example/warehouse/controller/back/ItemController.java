package com.example.warehouse.controller.back;

import com.example.warehouse.entity.Item;
import com.example.warehouse.service.itemservice.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    IItemService itemService;

    @GetMapping("/all")
    public Iterable<Item> allItems() {
        return itemService.findAll();
    }
}
