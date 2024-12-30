package com.example.spring4.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("product")
public class ProductController {

    @GetMapping("product")
    public String product() {
        System.out.println("product 화면 요청 >>>> ");
        return "product/product";
    }
}
