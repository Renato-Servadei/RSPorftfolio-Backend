package com.demo.App.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPro;
    private String nombrePro;
    private String descPro;
    private String pagPro;
    private String codPro;
    private String imgPro;
    
    

    public Proyectos() {
    }

    public Proyectos (Long idPro, String nombrePro, String descPro, String pagPro, String codPro, String imgPro) {
        this.idPro = idPro;
        this.nombrePro = nombrePro;
        this.descPro = descPro;
        this.pagPro = pagPro;
        this.codPro = codPro;
        this.imgPro = imgPro;
    }
    
    
}

