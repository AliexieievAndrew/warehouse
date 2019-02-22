package com.example.warehouse.service.detailservice;

import com.example.warehouse.entity.Detail;
import com.example.warehouse.entity.Item;

import java.util.List;

public interface IDetailService {
    Iterable<Detail> findAll();

    void saveAll (List<Detail> details);

    Detail findById(int id);

    List<Detail> findByItem(Item item);

    double averagePrice(List<Detail> details);

    double minPrice(List<Detail> details);

    double maxPrice(List<Detail> details);
}
