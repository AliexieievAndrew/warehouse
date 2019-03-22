package com.example.warehouse.service.detailservice;

import com.example.warehouse.dto.Balance;
import com.example.warehouse.dto.ChartRangeItemDTO;
import com.example.warehouse.entity.Detail;
import com.example.warehouse.entity.Item;
import com.example.warehouse.repository.DetailRepository;
import com.example.warehouse.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class DetailService implements IDetailService {
    @Autowired
    private DetailRepository detailRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Detail> findAll() {
        return detailRepository.findAll();
    }

    @Override
    public void saveAll(List<Detail> details) {
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
    public List<Detail> findByItem(String itemName) {
        Item item = itemRepository.findByName(itemName);
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

    @Override
    public List<Balance> getBalanceByAllItems() {
        return detailRepository.getBalanceByAllItems();
    }

    @Override
    public List<ChartRangeItemDTO> getChartRangeItems(String item, String dateFrom, String dateTo) {

        return detailRepository.getChartRangeItems(
                item,
                LocalDateTime.parse(dateFrom,
                        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))
                        .atOffset(ZoneOffset.MAX),
                LocalDateTime.parse(dateTo,
                        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))
                        .atOffset(ZoneOffset.MIN)

        );
    }
}
