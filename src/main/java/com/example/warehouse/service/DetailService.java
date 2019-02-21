package com.example.warehouse.service;

import com.example.warehouse.entity.Detail;
import com.example.warehouse.repository.DetailRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DetailService implements IDetailService{
    @Autowired
    private DetailRepository detailRepository;

    @Override
    public Iterable<Detail> findAll() {
        return detailRepository.findAll();
    }
}
