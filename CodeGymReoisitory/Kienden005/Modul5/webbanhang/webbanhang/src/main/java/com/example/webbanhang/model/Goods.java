package com.example.webbanhang.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;
@Entity
@Transactional
@Table(name = "goods")
public class Goods {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "price")
    private double price;

    @Column(name = "good_name")
    private String goodName;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "trade_mart")
    private String tradeMark;


    @Column(name = "sale_off")
    private Integer saleOff;

    @Column(name = "price_for_sale_off")
    private double priceForSaleOff;
    @Column(name = "src_img")
    private String srcImg;
    @ManyToOne
    @JoinColumn(name = "category_id")
    @JsonManagedReference
    private Category category;

    @OneToMany(targetEntity = Include.class,cascade = CascadeType.ALL, mappedBy="goods")
    @JsonBackReference
    private List<Include> includes;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "cart_id")
    private Cart cart;

    public Goods(Integer id, double price, String goodName, Integer quantity, String tradeMark, Category category, Integer saleOff, double priceForSaleOff, String srcImg, List<Include> includes, Cart cart) {
        this.id = id;
        this.price = price;
        this.goodName = goodName;
        this.quantity = quantity;
        this.tradeMark = tradeMark;
        this.category = category;
        this.saleOff = saleOff;
        this.priceForSaleOff = priceForSaleOff;
        this.srcImg = srcImg;
        this.includes = includes;
        this.cart = cart;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public String getSrcImg() {
        return srcImg;
    }

    public void setSrcImg(String srcImg) {
        this.srcImg = srcImg;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getSaleOff() {
        return saleOff;
    }

    public void setSaleOff(Integer saleOff) {
        this.saleOff = saleOff;
    }

    public double getPriceForSaleOff() {
        return priceForSaleOff;
    }

    public void setPriceForSaleOff(double priceForSaleOff) {
        this.priceForSaleOff = priceForSaleOff;
    }

    public List<Include> getIncludes() {
        return includes;
    }

    public void setIncludes(List<Include> includes) {
        this.includes = includes;
    }


    public Goods() {
    }


}
