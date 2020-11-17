package com.example.webbanhang.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Temporal(value = TemporalType.DATE)
    @Column(name = "created_date")
    private Date createDate;

    @Column(name = "bill_type")
    private boolean billType;

    @Column(name = "quantity")
    private Integer quantity;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "user_id")

    private User user;

    @OneToMany(targetEntity = Include.class,cascade = CascadeType.ALL,mappedBy = "bill")
    @JsonBackReference
    private List<Include> includes;

    public Bill() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public boolean isBillType() {
        return billType;
    }

    public void setBillType(boolean billType) {
        this.billType = billType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Include> getIncludes() {
        return includes;
    }

    public void setIncludes(List<Include> includes) {
        this.includes = includes;
    }

    public Bill(Integer id, Date createDate, boolean billType, Integer quantity, User user, List<Include> includes) {
        this.id = id;
        this.createDate = createDate;
        this.billType = billType;
        this.quantity = quantity;
        this.user = user;
        this.includes = includes;
    }


}
