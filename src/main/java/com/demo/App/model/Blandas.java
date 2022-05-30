package com.demo.App.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Hab_Blandas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idHab_B;
    private String nombreHab_B;
    private String iconoHab_B;
    
    

    public Hab_Blandas() {
    }

    public Hab_Blandas (Long idHab_B, String nombreHab_B, String iconoHab_B) {
        this.idHab_B = idHab_B;
        this.nombreHab_B = nombreHab_B;
        this.iconoHab_B = iconoHab_B;
    }
    
    
}

