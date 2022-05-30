package com.demo.App.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Certificaciones {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCer;
    private String nombreCer;
    private String linkCer;
    private String iconoCer;

    public Certificaciones() {
    }

    public Certificaciones(Long idCer, String nombreCer, String linkCer, String iconoCer) {
        this.idCer = idCer;
        this.nombreCer = nombreCer;
        this.linkCer = linkCer;
        this.iconoCer = iconoCer;
    }
    
    
}