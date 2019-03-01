package com.example.warehouse.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/invoices")
public class InvoiceController {

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

    @GetMapping(value = "/invoice/{id}")
    public String invoice(@PathVariable("id") int id, Model model) {
        model.addAttribute("page", "invoice");
        model.addAttribute("documentId", String.valueOf(id));
        return "index";
    }
}
