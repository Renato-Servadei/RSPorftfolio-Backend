package com.demo.App.controller;

import com.demo.App.model.Persona;
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
import com.demo.App.service.IPersona;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@CrossOrigin(origins="https://rsportfolio-front-a45ea.web.app")
@RequestMapping("/api/persona")
public class PersonaController {
    
    @Autowired
    public IPersona personaServ;
    
    @PostMapping
    public void crearPersona(@RequestBody Persona per) {
        personaServ.crearPersona(per);
    }
    
    @GetMapping
    @ResponseBody
    public List<Persona> verPersona() {
        return personaServ.verPersona();
    }
    
    @GetMapping("/{idPer}")
    @ResponseBody
    public Persona buscarPersona(@PathVariable("idPer") Long idPer) {
        return personaServ.buscarPersona(idPer);
    }
    
    @DeleteMapping("/{idPer}")
    public void borrarPersona(@PathVariable Long idPer) {
        personaServ.borrarPersona(idPer);
    }
    
    @PutMapping
    public ResponseEntity <Persona> editarPersona(@RequestBody Persona per) {
        Persona editarPersona = personaServ.editarPersona(per);
        return new ResponseEntity<>(editarPersona, HttpStatus.OK);
}
    }
            

