package com.demo.App.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;
    private String periodoEdu;
    private String tituloEdu;
    private String institucionEdu;
    
    public Educacion() {
    }

    public Educacion(Long idEdu, String periodoEdu, String tituloEdu, String institucionEdu) {
        this.idEdu = idEdu;
        this.periodoEdu = periodoEdu;
        this.tituloEdu = tituloEdu;
        this.institucionEdu = institucionEdu;
    }
    
    
}