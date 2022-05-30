package com.demo.App.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Blandas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBlandas;
    private String nombreBlandas;
    private String iconoBlandas;
    
    

    public Blandas() {
    }

    public Blandas (Long idBlandas, String nombreBlandas, String iconoBlandas) {
        this.idBlandas = idBlandas;
        this.nombreBlandas = nombreBlandas;
        this.iconoBlandas = iconoBlandas;
    }
    
    
}

