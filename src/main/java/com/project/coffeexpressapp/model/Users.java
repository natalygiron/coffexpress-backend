package com.project.coffeexpressapp.model;

import jakarta.persistence.*;

import java.sql.Blob;
import java.util.Date;

@Entity
@Table(name = "Users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String user_mail;
    private String user_password;
    private String user_firstname;
    private String user_lastname;
    private String user_address;
    private String user_phone;
    private Blob user_picture;
    private Date user_creation_date;

    public Users(int id, String user_mail, String user_password, String user_firstname, String user_lastname, String user_address, String user_phone, Blob user_picture, Date user_creation_date) {
        this.id = id;
        this.user_mail = user_mail;
        this.user_password = user_password;
        this.user_firstname = user_firstname;
        this.user_lastname = user_lastname;
        this.user_address = user_address;
        this.user_phone = user_phone;
        this.user_picture = user_picture;
        this.user_creation_date = user_creation_date;
    }

    public Users() {
    }

    public Date getUser_creation_date() {
        return user_creation_date;
    }

    public void setUser_creation_date(Date user_creation_date) {
        this.user_creation_date = user_creation_date;
    }

    public Blob getUser_picture() {
        return user_picture;
    }

    public void setUser_picture(Blob user_picture) {
        this.user_picture = user_picture;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getUser_lastname() {
        return user_lastname;
    }

    public void setUser_lastname(String user_lastname) {
        this.user_lastname = user_lastname;
    }

    public String getUser_firstname() {
        return user_firstname;
    }

    public void setUser_firstname(String user_firstname) {
        this.user_firstname = user_firstname;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_mail() {
        return user_mail;
    }

    public void setUser_mail(String user_mail) {
        this.user_mail = user_mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
