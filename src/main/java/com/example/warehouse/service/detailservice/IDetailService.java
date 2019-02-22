package com.example.warehouse.service.detailservice;

import com.example.warehouse.entity.Detail;

import java.util.List;

public interface IDetailService {
    Iterable<Detail> findAll();

    void saveAll (List<Detail> details);
}
