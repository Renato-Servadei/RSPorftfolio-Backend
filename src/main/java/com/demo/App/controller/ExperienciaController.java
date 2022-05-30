package com.demo.App.controller;


import com.demo.App.model.Experiencia;
import com.demo.App.service.IExperiencia;
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
public class ExperienciaController {
    
    List<Experiencia> listaExperiencia = new ArrayList();
    
    @Autowired
    private IExperiencia expServ;
    
    @PostMapping("/crear/experiencia")
    public void crearExperiencia(@RequestBody Experiencia exp) {
        expServ.crearExperiencia(exp);
    }
    
    @GetMapping("/ver/experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencia() {
        return expServ.verExperiencia();
    }
    
    @GetMapping("/ver/experiencia/{idExp}")
    @ResponseBody
    public Experiencia buscarExperiencia(@PathVariable("idExp") Long idExp) {
        return expServ.buscarExperiencia(idExp);
    }
    
    @DeleteMapping("/borrar/experiencia/{idExp}")
    public void borrarExperiencia(@PathVariable Long idExp) {
        expServ.borrarExperiencia(idExp);
    }
    
    @PutMapping("/editar/experiencia/{idExp}")
    public Experiencia editarExperiencia(@PathVariable Long idExp,
                                                @RequestParam("periodoExp") String nuevoPeriodo,
                                                @RequestParam("tituloExp") String nuevoTitulo,
                                                @RequestParam("institucionExp") String nuevaInstitucion) {
        Experiencia exp = expServ.buscarExperiencia(idExp);
        exp.setPeriodoExp(nuevoPeriodo);
        exp.setTituloExp(nuevoTitulo);
        exp.setInstitucionExp(nuevaInstitucion);
        
        expServ.crearExperiencia(exp);
        return exp;
}
    
}

