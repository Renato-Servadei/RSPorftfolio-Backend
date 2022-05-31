package com.demo.App.controller;


import com.demo.App.model.Proyectos;
import com.demo.App.service.IProyectos;
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
@CrossOrigin(origins="https://rsportfolio-front-a45ea.web.app")
@RequestMapping("/api/proyectos")
public class ProyectosController {
    
    List<Proyectos> listaProyectos = new ArrayList();
    
    @Autowired
    private IProyectos proServ;
    
    @PostMapping
    public void crearProyectos(@RequestBody Proyectos pro) {
        proServ.crearProyectos(pro);
    }
    
    @GetMapping
    @ResponseBody
    public List<Proyectos> verProyectos() {
        return proServ.verProyectos();
    }
    
    @GetMapping("/{idPro}")
    @ResponseBody
    public Proyectos buscarProyectos(@PathVariable("idPro") Long idPro) {
        return proServ.buscarProyectos(idPro);
    }
    
    @DeleteMapping("/{idPro}")
    public void borrarProyectos(@PathVariable Long idPro) {
        proServ.borrarProyectos(idPro);
    }
    
    @PutMapping
    public ResponseEntity <Proyectos> editarProyectos(@RequestBody Proyectos pro) {
        Proyectos editarProyectos = proServ.editarProyectos(pro);
        return new ResponseEntity <> (editarProyectos, HttpStatus.OK);
}
    
}
