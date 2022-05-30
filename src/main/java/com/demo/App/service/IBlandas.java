package com.demo.App.service;

import com.demo.App.model.Blandas;
import java.util.List;

public interface IBlandas {


    public List<Blandas> verBlandas();
    public void crearBlandas(Blandas blandas);
    public void borrarBlandas(Long idBlandas);
    public Blandas buscarBlandas(Long idBlandas); 
    public Blandas editarBlandas(Blandas blandas);
}
