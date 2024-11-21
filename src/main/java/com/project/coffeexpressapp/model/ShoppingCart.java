package com.project.coffeexpressapp.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_shopcart")
    private int id;

    @OneToOne
    @JoinColumn(name = "id_user", nullable = false)
    private Users user;

    @Column(name = "shopcart_total")
    private double total;

    @CreatedDate
    @Column(name = "shopcart_creation_date", nullable = false, updatable = false)
    private LocalDateTime createdDate;

    public ShoppingCart(int id, Users user, double total, LocalDateTime createdDate) {
        this.id = id;
        this.user = user;
        this.total = total;
        this.createdDate = createdDate;
    }

    public ShoppingCart() {

    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
