package com.demo.App.model;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Persona {
    
    private Long id;
    private String nombre;
    private String Apellido;

    public Persona() {
    }

    public Persona(Long id, String nombre, String Apellido) {
        this.id = id;
        this.nombre = nombre;
        this.Apellido = Apellido;
    }
    
    
}
