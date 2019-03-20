package com.example.warehouse.controller.back;

import com.example.warehouse.dto.Balance;
import com.example.warehouse.entity.Detail;
import com.example.warehouse.entity.Item;
import com.example.warehouse.service.detailservice.IDetailService;
import com.example.warehouse.service.documentservice.IDocumentService;
import com.example.warehouse.service.itemservice.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

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
    public List<Balance> getBalance () {
        return detailService.getBalanceByAllItems();
    }

    @GetMapping("/balance/{item}")
    public List<Detail> getDetailByItemName (@PathVariable(value = "item") String item) {
        return detailService.findByItem(item);
    }
}
