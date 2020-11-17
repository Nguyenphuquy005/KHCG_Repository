package com.example.demo.model;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "listmoto")
public class ListMoto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMoto ;

    @Column(unique = true)
    private String nameMoto ;
    @NotNull(message = "weight not null And data Double")
    private double weight ;
    @NotNull(message = "weight not null And data Double")
    private double hourePower ;
    private String img ;
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img;
    }

    public ListMoto() {
    }

    public long getIdMoto() {
        return idMoto;
    }

    public void setIdMoto(long idMoto) {
        this.idMoto = idMoto;
    }

    public String getNameMoto() {
        return nameMoto;
    }

    public void setNameMoto(String nameMoto) {
        this.nameMoto = nameMoto;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHourePower() {
        return hourePower;
    }

    public void setHourePower(double hourePower) {
        this.hourePower = hourePower;
    }

    public Categorite getCategorite() {
        return categorite;
    }

    public void setCategorite(Categorite categorite) {
        this.categorite = categorite;
    }

    @ManyToOne
    @JoinColumn(name = "idCagorite")
    private Categorite categorite ;

}
