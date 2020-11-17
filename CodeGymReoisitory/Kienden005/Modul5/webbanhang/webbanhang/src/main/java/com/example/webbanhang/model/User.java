package com.example.webbanhang.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String passWord;

    @OneToMany(targetEntity = Cart.class,cascade = CascadeType.ALL,mappedBy = "user")
    @JsonBackReference
    private List<Cart> carts;

    @OneToMany(targetEntity = Bill.class,cascade = CascadeType.ALL,mappedBy = "user")
    @JsonBackReference
    private List<Bill> bills;

    public List<Cart> getCarts() {
        return carts;
    }


    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }

    public User() {
    }

    public User(Integer id, String fullName, String userName, String passWord, List<Cart> carts, List<Bill> bills) {
        this.id = id;
        this.fullName = fullName;
        this.userName = userName;
        this.passWord = passWord;
        this.carts = carts;
        this.bills = bills;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
