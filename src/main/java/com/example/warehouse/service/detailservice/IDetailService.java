package com.example.warehouse.service.detailservice;

import com.example.warehouse.dto.Balance;
import com.example.warehouse.entity.Detail;
import com.example.warehouse.entity.Item;

import java.util.List;
import java.util.Map;

public interface IDetailService {
    List<Detail> findAll();

    void saveAll (List<Detail> details);

    Detail findById(int id);

    List<Detail> findByItem(Item item);

    List<Detail> findByItem(String itemName);

    double averagePrice(List<Detail> details);

    double minPrice(List<Detail> details);

    double maxPrice(List<Detail> details);

    List<Balance> getBalanceByAllItems();
}
