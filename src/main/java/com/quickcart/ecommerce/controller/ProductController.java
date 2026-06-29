package com.quickcart.ecommerce.controller;

import com.quickcart.ecommerce.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @GetMapping({ "/", "/products" })
    public String getProducts(Model productModel) {
        List<Product> productsList = new ArrayList<>();
        Product laptop = new Product(1, "Laptop", "Lenovo Thinkpad", 999.99);
        Product smartphone = new Product(2, "Smartphone", "Samsung Galaxy S24 Ultra", 1399.99);
        Product headphones = new Product(3, "Headphones", "Sony WH1000-XM5", 399.99);
        productsList.add(laptop);
        productsList.add(smartphone);
        productsList.add(headphones);

        productModel.addAttribute("products", productsList);
        //return "products-view"; do this for jsp
        return "products" //do this for thymeleaf
    }

}
