package com.cod.market.product.controller;

import com.cod.market.product.entity.Product;
import com.cod.market.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/adm/product")
public class AdmProductController {
    private final ProductService productService;

    @GetMapping("/create")
    public String create(Model model) {
        List<Product> productList = productService.getList();

        model.addAttribute("productList", productList);

        return "adm/product/create";
    }

    @PostMapping("/create")
    public String createContent(
            @RequestParam("name") String name, @RequestParam("description") String description,
            @RequestParam("price") int price, @RequestParam("thumbnail") MultipartFile thumbnail

    ) {
        productService.create(name, description, price, thumbnail);

        return "adm/product/create";
    }
}