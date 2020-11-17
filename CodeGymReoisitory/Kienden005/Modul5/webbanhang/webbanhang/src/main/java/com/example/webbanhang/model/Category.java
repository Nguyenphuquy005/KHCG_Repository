package com.example.webbanhang.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @OneToMany(targetEntity = Goods.class,cascade = CascadeType.ALL, mappedBy="category")
    @JsonBackReference
    private List<Goods> goods;

    public Category() {
    }
    public Category(Integer id,String name,List<Goods> goods) {
        this.goods = goods;
        this.id = id;
         this.name = name;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }
}
