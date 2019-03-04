package com.example.warehouse.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/create-document")
public class CreateDocumentController {

    @GetMapping ("/create-income-invoice")
    public String createIncomeInvoice(Model model) {
            model.addAttribute("page", "create-income-invoice");
        return "index";
    }
}
