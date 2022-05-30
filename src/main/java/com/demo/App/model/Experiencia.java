package com.demo.App.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String periodoExp;
    private String tituloExp;
    private String institucionExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String periodoExp, String tituloExp, String institucionExp) {
        this.idExp = idExp;
        this.periodoExp = periodoExp;
        this.tituloExp = tituloExp;
        this.institucionExp = institucionExp;
    }
    
    
}
