package com.project.coffeexpressapp.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Blob;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_store")
    private int id;

    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Products> products;

    @Column(name = "store_mail", nullable = false, length = 255, unique = true)
    private String email;

    @Column(name = "store_password", nullable = false, length = 255)
    private String password;

    @Column(name = "store_name", nullable = false, length = 255)
    private String name;

    @Column(name = "store_description")
    private String description;

    @Column(name = "store_location", nullable = false, length = 255)
    private String location;

    @Column(name = "store_picture")
    private Blob picture;

//    @CreatedDate
    @CreationTimestamp
    @Column(name = "store_creation_date", nullable = false, updatable = false)
    private LocalDateTime createdDate;

    public Store(int id, String email, String password, String name, String description, String location, Blob picture, LocalDateTime createdDate) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.description = description;
        this.location = location;
        this.picture = picture;
        this.createdDate = createdDate;
    }

    public Store() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Blob getPicture() {
        return picture;
    }

    public void setPicture(Blob picture) {
        this.picture = picture;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
