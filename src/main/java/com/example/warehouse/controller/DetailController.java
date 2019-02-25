package com.example.warehouse.controller;

import com.example.warehouse.entity.Detail;
import com.example.warehouse.entity.Item;
import com.example.warehouse.service.detailservice.IDetailService;
import com.example.warehouse.service.documentservice.IDocumentService;
import com.example.warehouse.service.itemservice.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public Iterable<Detail> findAllDetails() {
        return detailService.findAll();
    }

}
