package com.demo.App.controller;


import com.demo.App.model.Blandas;
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
import com.demo.App.service.IBlandas;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin(origins="https://rsportfolio-front-a45ea.web.app")
@RequestMapping("/api/blandas")

public class BlandasController {
    
    List<Blandas> listaBlandas = new ArrayList();
    
    @Autowired
    private IBlandas blandasServ;
    
    @PostMapping
    public void crearBlandas(@RequestBody Blandas blandas) {
        blandasServ.crearBlandas(blandas);
    }
    
    @GetMapping
    @ResponseBody
    public List<Blandas> verBlandas() {
        return blandasServ.verBlandas();
    }
    
    @GetMapping("{idBlandas}")
    @ResponseBody
    public Blandas buscarBlandas(@PathVariable("idBlandas") Long idBlandas) {
        return blandasServ.buscarBlandas(idBlandas);
    }
    
    @DeleteMapping("/{idBlandas}")
    public void borrarBlandas(@PathVariable Long idBlandas) {
        blandasServ.borrarBlandas(idBlandas);
    }
    
    @PutMapping
    public ResponseEntity<Blandas> editarBlandas(@RequestBody Blandas blandas) {
        Blandas editarBlandas = blandasServ.editarBlandas(blandas);
        return new ResponseEntity<>(editarBlandas, HttpStatus.OK);
}
    
}
