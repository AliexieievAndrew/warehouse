package com.example.warehouse.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/charts")
public class ChartsController {

    @GetMapping("/all-items")
    public String allItems(Model model) {
        model.addAttribute("page","all-items");
        return "index";
    }
}
