package com.nqdtotty.productmng.controller;

import com.nqdtotty.productmng.entity.Category;
import com.nqdtotty.productmng.repository.CategoryRepository;
import com.nqdtotty.productmng.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(path = "/categories")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getAllCategory(ModelMap modelMap) {
        modelMap.addAttribute("name", "Nguyen Thoai");
        modelMap.addAttribute("age", 21);

        List<Category> categories = categoryService.getAllCategory();
        System.out.println("In CategoryController" + categories);
        modelMap.addAttribute("categories", categories);

        return "category";
    }
}
