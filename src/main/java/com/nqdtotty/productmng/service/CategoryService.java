package com.nqdtotty.productmng.service;

import com.nqdtotty.productmng.entity.Category;
import com.nqdtotty.productmng.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategory() {
        System.out.println("In CategoryService:" + categoryRepository.findAll());
        return categoryRepository.findAll();
    }
}
