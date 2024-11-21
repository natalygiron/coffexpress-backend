package com.project.coffeexpressapp.service;

import com.project.coffeexpressapp.model.Products;
import com.project.coffeexpressapp.model.Store;
import com.project.coffeexpressapp.repository.ProductRepository;
import com.project.coffeexpressapp.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private StoreRepository storeRepository;

    public List<Products> getAllProducts() {
        return productRepository.findAll();
    }

    public Products getProductById(int id) {
        return productRepository
                .findById(id)
                .orElseThrow( () -> new RuntimeException("Product not found.") );
    }

    public Products createProduct(Products product) {
        int idStore = product.getStore().getId();
        if(!storeRepository.existsById(idStore)) {
            throw new IllegalArgumentException("The store with id " + idStore
                    + " does not exist.");
        }
        return productRepository.save(product);
    }

    public Products updateProduct(Products dataProduct) {
        Products product = getProductById(dataProduct.getId());
        product.setName(dataProduct.getName());
        product.setCategory(dataProduct.getCategory());
        product.setDescription(dataProduct.getDescription());
        product.setCurrency(dataProduct.getCurrency());
        product.setStore(dataProduct.getStore());
        product.setPrice(dataProduct.getPrice());
        product.setStock(dataProduct.getStock());
        product.setPicture(dataProduct.getPicture());
        return productRepository.save(product);
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }


}
