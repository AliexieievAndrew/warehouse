package com.example.warehouse.repository;

import com.example.warehouse.entity.Detail;
import com.example.warehouse.entity.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DetailRepository extends CrudRepository<Detail,Integer> {
    Detail findById(int id);
    List<Detail> findByItem(Item item);
}
