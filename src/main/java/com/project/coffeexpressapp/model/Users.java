package com.project.coffeexpressapp.model;

import jakarta.persistence.*;

import java.sql.Blob;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(mappedBy = "user")
    private ShoppingCart shopCart;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Orders> orders;

    @Column(name = "user_mail", nullable = false, length = 50, unique = true)
    private String email;

    @Column(name = "user_password", nullable = false, length = 50)
    private String password;

    @Column(name = "user_firstname", nullable = false, length = 50)
    private String firstName;

    @Column(name = "user_lastname", nullable = false, length = 50)
    private String lastName;

    @Column(name = "user_address", nullable = false, length = 50)
    private String address;

    @Column(name = "user_phone", length = 20)
    private String phone;

    @Column(name = "user_picture")
    private Blob picture;

    @Column(name = "user_creation_date", nullable = false)
    private LocalDateTime creationDate;

    public Users(int id, ShoppingCart shopCart, String email, String password, String firstName, String lastName, String address, String phone, Blob picture, LocalDateTime creationDate) {
        this.id = id;
        this.shopCart = shopCart;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.picture = picture;
        this.creationDate = creationDate;
    }

    public Users() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ShoppingCart getShopCart() {
        return shopCart;
    }

    public void setShopCart(ShoppingCart shopCart) {
        this.shopCart = shopCart;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Blob getPicture() {
        return picture;
    }

    public void setPicture(Blob picture) {
        this.picture = picture;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
