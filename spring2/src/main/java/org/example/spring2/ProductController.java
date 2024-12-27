package org.example.spring2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    @GetMapping("product")
    public String product() {
        return "product";
    }

    @PostMapping("product2")
    public String product2(ProductVO productVO, Model model) {
        model.addAttribute("productVO", productVO);
        return "product2";
    }

    @GetMapping("product3")
    public String product3(){
        return "product3";
    }

    @PostMapping("product4")
    public String product4(ProductVO productVO, Model model) {
        model.addAttribute("productVO", productVO);
        return "product4";
    }

}
