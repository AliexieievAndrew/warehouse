package com.example.warehouse.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/balance")
public class BalanceController {

    @GetMapping(value = "/all")
    public String balance(Model model) {
        model.addAttribute("page", "balance");
        return "index";
    }
    // only testing
    @GetMapping(value = "/period")
    public String balancePeriod(Model model) {
        model.addAttribute("page", "balance-period");
        return "index";
    }

}
