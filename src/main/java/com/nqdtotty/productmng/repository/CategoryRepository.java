package com.nqdtotty.productmng.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nqdtotty.productmng.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {
}
