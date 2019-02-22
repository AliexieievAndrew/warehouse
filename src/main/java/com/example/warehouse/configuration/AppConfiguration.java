package com.example.warehouse.configuration;

import com.example.warehouse.service.detailservice.DetailService;
import com.example.warehouse.service.documentservice.DocumentService;
import com.example.warehouse.service.detailservice.IDetailService;
import com.example.warehouse.service.documentservice.IDocumentService;
import com.example.warehouse.service.documenttypeservice.DocumentTypeService;
import com.example.warehouse.service.documenttypeservice.IDocumentTypeService;
import com.example.warehouse.service.itemservice.IItemService;
import com.example.warehouse.service.itemservice.ItemService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public IDocumentService getDocumentService() {
        return new DocumentService();
    }

    @Bean
    public IDetailService getDetailService() {
        return new DetailService();
    }

    @Bean
    public IDocumentTypeService getDocumentTypeService() {
        return new DocumentTypeService();
    }

    @Bean
    public IItemService getItemService() {
        return new ItemService();
    }
}
