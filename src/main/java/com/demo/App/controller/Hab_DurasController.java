package com.demo.App.controller;


import com.demo.App.model.Hab_Duras;
import com.demo.App.service.IHab_Duras;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hab_DurasController {
    
    List<Hab_Duras> listaHab_Duras = new ArrayList();
    
    @Autowired
    private IHab_Duras hab_dServ;
    
    @PostMapping("/crear/hab_duras")
    public void crearHab_Duras(@RequestBody Hab_Duras hab_d) {
        hab_dServ.crearHab_Duras(hab_d);
    }
    
    @GetMapping("/ver/hab_duras")
    @ResponseBody
    public List<Hab_Duras> verHab_Duras() {
        return hab_dServ.verHab_Duras();
    }
    
    @GetMapping("/ver/hab_duras/{idHab_d}")
    @ResponseBody
    public Hab_Duras buscarHab_Duras(@PathVariable("idHab_d") Long idHab_d) {
        return hab_dServ.buscarHab_Duras(idHab_d);
    }
    
    @DeleteMapping("/borrar/hab_duras/{idHab_d}")
    public void borrarHab_Duras(@PathVariable Long idHab_d) {
        hab_dServ.borrarHab_Duras(idHab_d);
    }
    
    @PutMapping("/editar/hab_duras/{idHab_d}")
    public Hab_Duras editarHab_Duras(@PathVariable Long idHab_d,
                                                @RequestParam("nombreHab_d") String nuevoNombre,
                                                @RequestParam("tituloHab_d") String nuevoIcono) {
        Hab_Duras hab_d = hab_dServ.buscarHab_Duras(idHab_d);
        hab_d.setNombreHab_D(nuevoNombre);
        hab_d.setIconoHab_D(nuevoIcono);
        
        hab_dServ.crearHab_Duras(hab_d);
        return hab_d;
}
    
}
