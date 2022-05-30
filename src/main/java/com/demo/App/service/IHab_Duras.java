package com.demo.App.service;

import com.demo.App.model.Hab_Duras;
import java.util.List;

public interface IHab_Duras {

 public List<Hab_Duras> verHab_Duras();
    public void crearHab_Duras(Hab_Duras hab_d);
    public void borrarHab_Duras(Long idHab_d);
    public Hab_Duras buscarHab_Duras(Long idHab_d);     
    public Hab_Duras editarHab_Duras(Hab_Duras hab_d);
}
