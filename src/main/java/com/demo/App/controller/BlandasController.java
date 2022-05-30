package com.demo.App.controller;


import com.demo.App.model.Hab_Blandas;
import com.demo.App.service.IHab_Blandas;
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
public class Hab_BlandasController {
    
    List<Hab_Blandas> listaHab_Blandas = new ArrayList();
    
    @Autowired
    private IHab_Blandas hab_bServ;
    
    @PostMapping("/crear/hab_blandas")
    public void crearHab_Blandas(@RequestBody Hab_Blandas hab_b) {
        hab_bServ.crearHab_Blandas(hab_b);
    }
    
    @GetMapping("/ver/hab_blandas")
    @ResponseBody
    public List<Hab_Blandas> verHab_Blandas() {
        return hab_bServ.verHab_Blandas();
    }
    
    @GetMapping("/ver/hab_blandas/{idHab_b}")
    @ResponseBody
    public Hab_Blandas buscarHab_Blandas(@PathVariable("idHab_b") Long idHab_b) {
        return hab_bServ.buscarHab_Blandas(idHab_b);
    }
    
    @DeleteMapping("/borrar/hab_blandas/{idHab_b}")
    public void borrarHab_Blandas(@PathVariable Long idHab_b) {
        hab_bServ.borrarHab_Blandas(idHab_b);
    }
    
    @PutMapping("/editar/hab_blandas/{idHab_b}")
    public Hab_Blandas editarHab_Blandas(@PathVariable Long idHab_b,
                                                @RequestParam("nombreHab_b") String nuevoNombre,
                                                @RequestParam("tituloHab_b") String nuevoIcono) {
        Hab_Blandas hab_b = hab_bServ.buscarHab_Blandas(idHab_b);
        hab_b.setNombreHab_B(nuevoNombre);
        hab_b.setIconoHab_B(nuevoIcono);
        
        hab_bServ.crearHab_Blandas(hab_b);
        return hab_b;
}
    
}
