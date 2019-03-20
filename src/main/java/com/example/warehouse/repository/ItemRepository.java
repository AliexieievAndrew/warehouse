package com.example.warehouse.repository;

import com.example.warehouse.entity.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item,Integer> {
    Item findById(int id);
    Item findByName(String name);

    @Override
    List<Item> findAll();
}
