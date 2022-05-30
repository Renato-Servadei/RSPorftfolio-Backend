package com.demo.App.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Hab_Duras {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idHab_D;
    private String nombreHab_D;
    private String iconoHab_D;
    
    

    public Hab_Duras() {
    }

    public Hab_Duras (Long idHab_D, String nombreHab_D, String iconoHab_D) {
        this.idHab_D = idHab_D;
        this.nombreHab_D = nombreHab_D;
        this.iconoHab_D = iconoHab_D;
    }
    
    
}

