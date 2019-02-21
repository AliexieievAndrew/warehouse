package com.example.warehouse.configuration;

import com.example.warehouse.service.DetailService;
import com.example.warehouse.service.DocumentService;
import com.example.warehouse.service.IDetailService;
import com.example.warehouse.service.IDocumentService;
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
}
