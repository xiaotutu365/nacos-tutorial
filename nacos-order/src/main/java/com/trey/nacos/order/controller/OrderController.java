package com.trey.nacos.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("saveOrder")
    public String saveOrder() {
        String rtn = restTemplate.getForObject("http://stock-service/stock/decreaseStock", String.class);
        return rtn;
    }
}