package com.demo.App.controller;


import com.demo.App.model.Duras;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.demo.App.service.IDuras;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/duras")
public class DurasController {
    
    List<Duras> listaDuras = new ArrayList();
    
    @Autowired
    public IDuras durasServ;
    
    @PostMapping
    public void crearDuras(@RequestBody Duras duras) {
        durasServ.crearDuras(duras);
    }
    
    @GetMapping
    @ResponseBody
    public List<Duras> verDuras() {
        return durasServ.verDuras();
    }
    
    @GetMapping("/{idDuras}")
    @ResponseBody
    public Duras buscarDuras(@PathVariable("idDuras") Long idDuras) {
        return durasServ.buscarDuras(idDuras);
    }
    
    @DeleteMapping("/{idDuras}")
    public void borrarDuras(@PathVariable Long idDuras) {
        durasServ.borrarDuras(idDuras);
    }
    
    @PutMapping
    public ResponseEntity <Duras> editarDuras(@RequestBody Duras duras) {
        Duras editarDuras = durasServ.editarDuras(duras);
        return new ResponseEntity<>(editarDuras, HttpStatus.OK);
}
    
}
