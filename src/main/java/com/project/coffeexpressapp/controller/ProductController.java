package com.project.coffeexpressapp.controller;

import com.project.coffeexpressapp.model.Products;
import com.project.coffeexpressapp.model.Store;
import com.project.coffeexpressapp.repository.StoreRepository;
import com.project.coffeexpressapp.service.ProductService;
import com.project.coffeexpressapp.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private StoreRepository storeRepository;

    @GetMapping
    public List<Products> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Products getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public Products createProduct(@RequestBody Products product) {
        Store store = storeRepository.findById(product.getStore().getId())
                .orElseThrow(() -> new RuntimeException("Store not found"));
        product.setStore(store);
        return productService.createProduct(product);
    }

    @PutMapping("/{id}")
    public Products updateProduct(@PathVariable int id) {
        Products product = productService.getProductById(id);
        return productService.updateProduct(product);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
        return "Product with id-"+ id + " has been deleted";

    }






}
