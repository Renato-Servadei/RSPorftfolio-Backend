package com.demo.App.service;

import com.demo.App.model.Persona;
import java.util.List;



public interface IPersona {
    
    public List<Persona> verPersona();
    public void crearPersona(Persona per);
    public void borrarPersona(Long idPer);
    public Persona buscarPersona(Long idPer);
    public Persona editarPersona(Persona per);
}
