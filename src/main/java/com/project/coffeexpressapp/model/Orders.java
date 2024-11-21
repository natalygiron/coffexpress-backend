package com.project.coffeexpressapp.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    private int idOrder;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private Users user;

    @Column(name = "order_price", nullable = false)
    private Double price;

    @Column(name = "order_divisa", nullable = false, length = 3)
    private String currency;

    @Column(name = "order_status", nullable = false, length = 25)
    private String status;

    @CreatedDate
    @Column(name = "order_creation_date", nullable = false, updatable = false)
    private LocalDateTime createdDate;

    public Orders() {
    }

    public Orders(int idOrder, Users user, Double price, String currency, String status, LocalDateTime createdDate) {
        this.idOrder = idOrder;
        this.user = user;
        this.price = price;
        this.currency = currency;
        this.status = status;
        this.createdDate = createdDate;
    }

    public int getId() {
        return idOrder;
    }

    public void setId(int id) {
        this.idOrder = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDivisa() {
        return currency;
    }

    public void setDivisa(String divisa) {
        this.currency = divisa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
