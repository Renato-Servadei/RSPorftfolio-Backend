package com.demo.App.controller;


import com.demo.App.model.Proyectos;
import com.demo.App.service.IProyectos;
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
public class ProyectosController {
    
    List<Proyectos> listaProyectos = new ArrayList();
    
    @Autowired
    private IProyectos proServ;
    
    @PostMapping("/crear/proyectos")
    public void crearProyectos(@RequestBody Proyectos pro) {
        proServ.crearProyectos(pro);
    }
    
    @GetMapping("/ver/proyectos")
    @ResponseBody
    public List<Proyectos> verProyectos() {
        return proServ.verProyectos();
    }
    
    @GetMapping("/ver/proyectos/{idPro}")
    @ResponseBody
    public Proyectos buscarProyectos(@PathVariable("idPro") Long idPro) {
        return proServ.buscarProyectos(idPro);
    }
    
    @DeleteMapping("/borrar/proyectos/{idPro}")
    public void borrarProyectos(@PathVariable Long idPro) {
        proServ.borrarProyectos(idPro);
    }
    
    @PutMapping("/editar/proyectos/{idPro}")
    public Proyectos editarProyectos(@PathVariable Long idPro,
                                                @RequestParam("nombrePro") String nuevoNombre,
                                                @RequestParam("descPro") String nuevaDesc,
                                                @RequestParam("imgPro") String nuevaImg,
                                                @RequestParam("codPro") String nuevoCod,
                                                @RequestParam("pagPro") String nuevaPag) {
        Proyectos pro = proServ.buscarProyectos(idPro);
        pro.setNombrePro(nuevoNombre);
        pro.setDescPro(nuevaDesc);
        pro.setImgPro(nuevaImg);
        pro.setCodPro(nuevoCod);
        pro.setPagPro(nuevaPag);
        
        proServ.crearProyectos(pro);
        return pro;
}
    
}
