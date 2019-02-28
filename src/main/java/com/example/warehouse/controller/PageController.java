package com.example.warehouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class PageController {

    @GetMapping(value = {"","/","index"})
    public String index() {
        return "index";
    }

    @GetMapping(value = "/incomeInvoices")
    public String incomeInvoices(Model model) {
        model.addAttribute("page", "invoices");
        model.addAttribute("documentType", 1);
        return "index";
    }

    @GetMapping(value = "/outcomeInvoices")
    public String outcomeInvoices(Model model) {
        model.addAttribute("page", "invoices");
        model.addAttribute("documentType", 2);
        return "index";
    }
}
