package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorite")
public class Categorite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCategorite ;
    private String categorite ;
    @OneToMany(targetEntity = ListMoto.class)
    List<ListMoto> listMotoList ;

    public Categorite() {
    }

    public long getIdCategorite() {
        return idCategorite;
    }

    public void setIdCategorite(long idCategorite) {
        this.idCategorite = idCategorite;
    }

    public String getCategorite() {
        return categorite;
    }

    public void setCategorite(String categorite) {
        this.categorite = categorite;
    }

    public List<ListMoto> getListMotoList() {
        return listMotoList;
    }

    public void setListMotoList(List<ListMoto> listMotoList) {
        this.listMotoList = listMotoList;
    }
}
