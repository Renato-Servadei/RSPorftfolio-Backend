package com.demo.App.service;

import com.demo.App.model.Proyectos;
import java.util.List;


public interface IProyectos {


    public List<Proyectos> verProyectos();
    public void crearProyectos(Proyectos pro);
    public void borrarProyectos(Long idPro);
    public Proyectos buscarProyectos(Long idPro); 
    public Proyectos editarProyectos(Proyectos pro);
}
