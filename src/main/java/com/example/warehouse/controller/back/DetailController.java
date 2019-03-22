package com.example.warehouse.controller.back;

import com.example.warehouse.dto.Balance;
import com.example.warehouse.dto.ChartRangeItemDTO;
import com.example.warehouse.entity.Detail;
import com.example.warehouse.service.detailservice.IDetailService;
import com.example.warehouse.service.documentservice.IDocumentService;
import com.example.warehouse.service.itemservice.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detail")
public class DetailController {

    @Autowired
    private IDetailService detailService;

    @Autowired
    private IDocumentService documentService;

    @Autowired
    private IItemService itemService;

    @GetMapping("/all")
    public List<Detail> findAllDetails() {
        return detailService.findAll();
    }

    @GetMapping("/balance")
    public List<Balance> getBalance() {
        return detailService.getBalanceByAllItems();
    }

    @GetMapping("/balance/{item}")
    public List<Detail> getDetailByItemName(@PathVariable(value = "item") String item) {
        return detailService.findByItem(item);
    }

    @GetMapping("/range-items")
    public List<ChartRangeItemDTO> getChartRangeItems(@RequestParam("item") String item,
                                                      @RequestParam("dateFrom") String dateFrom,
                                                      @RequestParam("dateTo") String dateTo) {
        return detailService.getChartRangeItems(item, dateFrom, dateTo);
    }
}
