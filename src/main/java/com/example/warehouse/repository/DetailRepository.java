package com.example.warehouse.repository;

import com.example.warehouse.dto.Balance;
import com.example.warehouse.entity.Detail;
import com.example.warehouse.entity.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DetailRepository extends CrudRepository<Detail,Integer> {
    @Override
    List<Detail> findAll();

    Detail findById(int id);
    List<Detail> findByItem(Item item);

    @Query("SELECT " +
        "NEW com.example.warehouse.dto.Balance(d.item, sum(d.debit),sum(d.credit)) " +
        "FROM  Detail d " +
        "GROUP BY d.item"
    )
    List<Balance> getBalanceByAllItems();

}
