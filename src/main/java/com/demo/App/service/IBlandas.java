package com.demo.App.service;

import com.demo.App.model.Hab_Blandas;
import java.util.List;

public interface IHab_Blandas {


    public List<Hab_Blandas> verHab_Blandas();
    public void crearHab_Blandas(Hab_Blandas hab_b);
    public void borrarHab_Blandas(Long idHab_b);
    public Hab_Blandas buscarHab_Blandas(Long idHab_b); 
    public Hab_Blandas editarHab_Blandas(Hab_Blandas hab_b);
}
