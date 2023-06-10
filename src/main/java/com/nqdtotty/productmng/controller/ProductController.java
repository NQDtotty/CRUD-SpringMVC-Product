package com.nqdtotty.productmng.controller;

import com.nqdtotty.productmng.entity.Product;
import com.nqdtotty.productmng.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/{categoryID}", method = RequestMethod.GET)
    public String getProductByCategoryID(ModelMap modelMap, @PathVariable String categoryID) {
        List<Product> products = productService.getProductByCategoryID(categoryID);
        modelMap.addAttribute("products", products);
        return "listProduct";
    }
}
