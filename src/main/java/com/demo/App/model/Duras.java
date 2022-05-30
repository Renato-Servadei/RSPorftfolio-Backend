package com.demo.App.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Duras {
    
      @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDuras;
    private String nombreDuras;
    private String iconoDuras;
    
    

    public Duras() {
    }

    public Duras (Long idDuras, String nombreDuras, String iconoDuras) {
        this.idDuras = idDuras;
        this.nombreDuras = nombreDuras;
        this.iconoDuras = iconoDuras;
    }
    
    
}

