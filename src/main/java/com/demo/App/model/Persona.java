package com.demo.App.model;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPer;
    private String nombrePer;
    private String ciudadPer;
    private String descPer;
    private String imgPer;

    public Persona() {
    }

    public Persona(Long idPer, String nombrePer, String ciudadPer, String descPer) {
        this.idPer = idPer;
        this.nombrePer = nombrePer;
        this.ciudadPer = ciudadPer;
        this.descPer = descPer;
    }
    
    
}

