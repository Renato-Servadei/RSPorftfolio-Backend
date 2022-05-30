package com.demo.App.service;

import com.demo.App.model.Educacion;
import java.util.List;


public interface IEducacion {
    
  public List<Educacion> verEducacion();
    public void crearEducacion(Educacion edu);
    public void borrarEducacion(Long idEdu);
    public Educacion buscarEducacion(Long idEdu);
    public Educacion editarEducacion(Educacion edu);
}
