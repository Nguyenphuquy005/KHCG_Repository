package com.example.webbanhang.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @JoinColumn(name = "id")
    private Integer id;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(targetEntity = Goods.class,cascade = CascadeType.ALL,mappedBy = "cart")
    @JsonBackReference
    private List<Goods> goods;

    public Cart(Integer id, User user, List<Goods> goods) {
        this.id = id;
        this.user = user;
        this.goods = goods;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Cart() {
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }
}
