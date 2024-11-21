package com.project.coffeexpressapp.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_payment")
    private int id;

    @Column(name = "payment_method")
    private String method;

    @Column(name = "payment_status")
    private String status;

    @CreatedDate
    @Column(name = "payment_date", nullable = false, updatable = false)
    private LocalDateTime createdDate;

    public Payment(int id, String method, String status, LocalDateTime createdDate) {
        this.id = id;
        this.method = method;
        this.status = status;
        this.createdDate = createdDate;
    }

    public Payment () {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
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
}
