package com.example.warehouse.service;

import com.example.warehouse.entity.Detail;

public interface IDetailService {
    Iterable<Detail> findAll();
}
