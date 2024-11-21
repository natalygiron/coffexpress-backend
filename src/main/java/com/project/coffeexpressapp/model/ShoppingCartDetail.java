package com.project.coffeexpressapp.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
public class ShoppingCartDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_shopcart_detail")
    private int id;

    @ManyToOne
    @JoinColumn(name="id_product", nullable = false)
    private Products product;

    @ManyToOne
    @JoinColumn(name="id_shopcart", nullable = false)
    private ShoppingCart shoppingCart;

    @Column(name = "shopcart_quantity")
    private int quantity;

    @CreatedDate
    @Column(name = "shopcart_detail_creation_date", nullable = false, updatable = false)
    private LocalDateTime createdDate;

    public ShoppingCartDetail() {

    }

    public ShoppingCartDetail(int id, Products product, ShoppingCart shoppingCart, int quantity, LocalDateTime createdDate) {
        this.id = id;
        this.product = product;
        this.shoppingCart = shoppingCart;
        this.quantity = quantity;
        this.createdDate = createdDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
