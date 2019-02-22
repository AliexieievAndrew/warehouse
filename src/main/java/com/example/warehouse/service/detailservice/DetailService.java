package com.example.warehouse.service.detailservice;

import com.example.warehouse.entity.Detail;
import com.example.warehouse.entity.Item;
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

    @Override
    public Detail findById(int id) {
        return detailRepository.findById(id);
    }

    @Override
    public List<Detail> findByItem(Item item) {
        return detailRepository.findByItem(item);
    }

    @Override
    public double averagePrice(List<Detail> details) {
        return details
                .stream()
                .mapToDouble(detail -> detail.getPrice())
                .average()
                .getAsDouble();
    }

    @Override
    public double minPrice(List<Detail> details) {
        return details
                .stream()
                .mapToDouble(detail -> detail.getPrice())
                .min()
                .getAsDouble();
    }

    @Override
    public double maxPrice(List<Detail> details) {
        return details
                .stream()
                .mapToDouble(detail -> detail.getPrice())
                .max()
                .getAsDouble();
    }
}
