package com.example.spring4.cart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cart")
public class CartController {

    @GetMapping("cart")
    public String cart() {
        System.out.println("cart 화면 요청>>>>>>");
        return "cart/cart";
    }
}
