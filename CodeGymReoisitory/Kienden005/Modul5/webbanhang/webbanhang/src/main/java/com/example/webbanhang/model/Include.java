package com.example.webbanhang.model;

import javax.persistence.*;
@Entity
@Table(name = "include")
public class Include {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "bill_id")
    private Bill bill;

    @ManyToOne
    @JoinColumn(name = "goods_id")
    private Goods goods;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Include() {
    }

    public Include(Integer id, Bill bill, Goods goods) {
        this.id = id;
        this.bill = bill;
        this.goods = goods;
    }
}
