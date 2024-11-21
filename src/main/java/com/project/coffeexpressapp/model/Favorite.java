package com.project.coffeexpressapp.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Table(name = "FavoriteProduct")
public class Favorite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_favorite_product")
    private int idFavorite;

    @ManyToOne
    @JoinColumn(name="id_user", nullable = false)
    private Users user;

    @ManyToOne
    @JoinColumn(name="id_product", nullable = false)
    private Products product;

    @CreatedDate
    @Column(name = "store_creation_date", nullable = false, updatable = false)
    private LocalDateTime createdDate;

    public Favorite(int idFavorite, Users user, Products product, LocalDateTime createdDate) {
        this.idFavorite = idFavorite;
        this.user = user;
        this.product = product;
        this.createdDate = createdDate;
    }

    public Favorite () {

    }

    public int getIdFavorite() {
        return idFavorite;
    }

    public void setIdFavorite(int idFavorite) {
        this.idFavorite = idFavorite;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
