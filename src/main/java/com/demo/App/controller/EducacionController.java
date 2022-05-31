package com.demo.App.controller;


import com.demo.App.model.Educacion;
import com.demo.App.service.IEducacion;
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
@RequestMapping("/api/educacion")
@CrossOrigin(origins="https://rsportfolio-front-a45ea.web.app")



public class EducacionController {
    
    List<Educacion> listaEducacion = new ArrayList();
    
    @Autowired
    private IEducacion eduServ;
    
    @PostMapping
    public void crearEducacion(@RequestBody Educacion edu) {
        eduServ.crearEducacion(edu);
    }
    
    @GetMapping
    @ResponseBody
    public List<Educacion> verEducacion() {
        return eduServ.verEducacion();
    }
    
    @GetMapping("/{idEdu}")
    @ResponseBody
    public Educacion buscarEducacion(@PathVariable("idEdu") Long idEdu) {
        return eduServ.buscarEducacion(idEdu);
    }
    
    @DeleteMapping("/{idEdu}")
    public void borrarEducacion(@PathVariable Long idEdu) {
        eduServ.borrarEducacion(idEdu);
    }
    
    @PutMapping
    public ResponseEntity <Educacion> editarEducacion(@RequestBody Educacion edu) {
        Educacion editarEducacion = eduServ.editarEducacion(edu);
        return new ResponseEntity<>(editarEducacion, HttpStatus.OK);
}
    
}
