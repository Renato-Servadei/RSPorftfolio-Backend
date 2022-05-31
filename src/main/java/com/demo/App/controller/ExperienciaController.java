package com.demo.App.controller;


import com.demo.App.model.Experiencia;
import com.demo.App.service.IExperiencia;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/experiencia")
@CrossOrigin(origins="https://rsportfolio-front-a45ea.web.app")

public class ExperienciaController {
    
    List<Experiencia> listaExperiencia = new ArrayList();
    
    @Autowired
    private IExperiencia expServ;
    
    @PostMapping
    public void crearExperiencia(@RequestBody Experiencia exp) {
        expServ.crearExperiencia(exp);
    }
    
    @GetMapping
    @ResponseBody
    public List<Experiencia> verExperiencia() {
        return expServ.verExperiencia();
    }
    
    @GetMapping("/{idExp}")
    @ResponseBody
    public Experiencia buscarExperiencia(@PathVariable("idExp") Long idExp) {
        return expServ.buscarExperiencia(idExp);
    }
    
    @DeleteMapping("/{idExp}")
    public void borrarExperiencia(@PathVariable Long idExp) {
        expServ.borrarExperiencia(idExp);
    }
    
    @PutMapping
    public ResponseEntity <Experiencia> editarExperiencia(@RequestBody Experiencia exp) {
        Experiencia editarExperiencia = expServ.editarExperiencia(exp);
        return new ResponseEntity <> (editarExperiencia, HttpStatus.OK);
}
    
}

