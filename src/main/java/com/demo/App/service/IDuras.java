package com.demo.App.service;

import com.demo.App.model.Duras;
import java.util.List;

public interface IDuras {

 public List<Duras> verDuras();
    public void crearDuras(Duras duras);
    public void borrarDuras(Long idDuras);
    public Duras buscarDuras(Long idDuras);     
    public Duras editarDuras(Duras duras);
}
