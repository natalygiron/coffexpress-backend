package com.project.coffeexpressapp.repository;

import com.project.coffeexpressapp.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Integer> {

}
