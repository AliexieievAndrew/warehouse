package com.example.warehouse.repository;

import com.example.warehouse.dto.Balance;
import com.example.warehouse.dto.ChartRangeItemDTO;
import com.example.warehouse.entity.Detail;
import com.example.warehouse.entity.Item;
import microsoft.sql.DateTimeOffset;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.OffsetDateTime;
import java.util.List;

public interface DetailRepository extends CrudRepository<Detail, Integer> {
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


    @Query("SELECT " +
            "NEW com.example.warehouse.dto.ChartRangeItemDTO(detail.item, doc.date, detail.price) " +
            "FROM Detail detail " +
            "JOIN detail.document doc " +
            "JOIN detail.item i "+
            "WHERE doc.date >= :dateFrom and doc.date <= :dateTo and i.name = :item"
    )
    List<ChartRangeItemDTO> getChartRangeItems(
            @Param("item") String item,
            @Param("dateFrom") OffsetDateTime dateFrom,
            @Param("dateTo") OffsetDateTime dateTo
    );
}
