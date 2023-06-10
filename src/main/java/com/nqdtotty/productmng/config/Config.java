package com.nqdtotty.productmng.config;

import com.nqdtotty.productmng.entity.Category;
import com.nqdtotty.productmng.entity.Product;
import com.nqdtotty.productmng.repository.CategoryRepository;
import com.nqdtotty.productmng.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Config {

    @Bean
    CommandLineRunner commandLineRunner(CategoryRepository categoryRepository, ProductRepository productRepository) {
        return args -> {
            Category category1 = new Category("C0101", "Beverages", "Soft drinks, coffees, teas, beers, and ales");
            Category category2 = new Category("C0102", "Condiments", "Sweet and savory sauces, relishes, spreads, and seasonings");
            Category category3 = new Category("C0103", "Confections", "Desserts, candies, and sweet breads");
            Category category4 = new Category("C0104", "Dairy Products", "Cheeses");
            Category category5 = new Category("C0105", "Grains_Cereals", "Breads, crackers, pasta, and cereal");
            Category category6 = new Category("C0106", "Meat_Poultry", "Prepared meats");
            Category category7 = new Category("C0107", "Produce", "Dried fruit and bean curd");
            Category category8 = new Category("C0108", "Seafood", "Seaweed and fish");

            Product product1 = new Product("P0101", "C0101", "Chai", 18, "Good product");
            Product product2 = new Product("P01010", "C0104", "Ikura", 31, "Good");
            Product product3 = new Product("P01011", "C0105", "Queso Cabrales", 21, "Good");
            Product product4 = new Product("P01012", "C0105", "Queso Manchego La Pastora", 38, "Good");
            Product product5 = new Product("P0102", "C0101", "Chang", 19, "best sell product");
            Product product6 = new Product("P0103", "C0101", "Aniseed Syrup", 10, "new produced");
            Product product7 = new Product("P0104", "C0102", "Chef Anton\\'s Cajun Seasoning", 22, "popular product");
            Product product8 = new Product("P0105", "C0102", "Chef Anton\\'s Gumbo Mix", 21, "Good For life");
            Product product9 = new Product("P0106", "C0103", "Grandma\\'s Boysenberry Spread", 25, "Good");
            Product product10 = new Product("P0107", "C0103", "Uncle Bob\\'s Organic Dried Pears", 30, "Good");
            Product product11 = new Product("P0108", "C0103", "Northwoods Cranberry Sauce", 40, "Good");
            Product product12 = new Product("P0109", "C0104", "Mishi Kobe Niku", 97, "Good");

            productRepository.saveAll(List.of(product1, product2, product3, product4, product5,
                    product6, product7, product8, product9, product10, product11, product12));
            categoryRepository.saveAll(List.of(category1,category2, category3, category4, category5, category6, category7, category8));
        };
    }
}
