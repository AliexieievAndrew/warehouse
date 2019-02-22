package com.example.warehouse.service.detailservice;

import com.example.warehouse.entity.Detail;
import com.example.warehouse.repository.DetailRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DetailService implements IDetailService {
    @Autowired
    private DetailRepository detailRepository;

    @Override
    public Iterable<Detail> findAll() {
        return detailRepository.findAll();
    }

    @Override
    public void saveAll (List<Detail> details) {
        detailRepository.saveAll(details);
    }
}
