package com.example.warehouse.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/balance")
public class BalanceController {

    @GetMapping(value = "/all")
    public String balance(Model model) {
        model.addAttribute("page", "balance");
        return "index";
    }

    @GetMapping(value = "/balance-item")
    public String balancePeriod(@RequestParam("item") String item, Model model) {
        model.addAttribute("item", item);
        model.addAttribute("page", "balance-item");
        return "index";
    }

}
