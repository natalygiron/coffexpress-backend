package com.project.coffeexpressapp.model;

import jakarta.persistence.*;

@Entity
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order_detail")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_order", nullable = false)
    private Orders order;

    @ManyToOne
    @JoinColumn(name = "id_product", nullable = false)
    private Products product;

    @Column(name = "order_details_quantity", nullable = false)
    private int quantity;

    @Column(name = "order_details_price", nullable = false)
    private double price;

    @Column(name = "order_details_divisa", nullable = false, length = 3)
    private String currency;

    public OrderDetail(int id, Orders order, Products product, int quantity, double price, String currency) {
        this.id = id;
        this.order = order;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.currency = currency;
    }

    public OrderDetail() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
