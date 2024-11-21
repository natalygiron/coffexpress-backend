package com.project.coffeexpressapp.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Blob;
import java.time.LocalDateTime;

@Entity
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private int id;

    @ManyToOne
    @JoinColumn(name="id_store", nullable = false)
    private Store store;

    @Column(name = "product_name", nullable = false, length = 50)
    private String name;

    @Column(name = "product_category", nullable = false, length = 25)
    private String category;

    @Column(name = "product_price", nullable = false)
    private Double price;

    @Column(name = "product_divisa", nullable = false, length = 3)
    private String currency;

    @Column(name = "product_description")
    private String description;

    @Column(name = "product_picture")
    private Blob picture;

    @Column(name = "product_stock")
    private int stock;

    //    @CreatedDate
    @CreationTimestamp
    @Column(name = "product_creation_date", nullable = false, updatable = false)
    private LocalDateTime createdDate;

    public Products() {
    }

    public Products(int id, Store store, String name, String category, Double price, String currency, String description, Blob picture, int stock, LocalDateTime createdDate) {
        this.id = id;
        this.store = store;
        this.name = name;
        this.category = category;
        this.price = price;
        this.currency = currency;
        this.description = description;
        this.picture = picture;
        this.stock = stock;
        this.createdDate = createdDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Blob getPicture() {
        return picture;
    }

    public void setPicture(Blob picture) {
        this.picture = picture;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
