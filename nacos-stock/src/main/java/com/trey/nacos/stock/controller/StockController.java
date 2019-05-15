package com.trey.nacos.stock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stock")
public class StockController {

    @RequestMapping("decreaseStock")
    public String decreaseStock() {
        return "decrease stock success.";
    }
}