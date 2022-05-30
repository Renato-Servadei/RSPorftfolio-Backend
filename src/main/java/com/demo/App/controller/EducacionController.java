package com.demo.App.controller;


import com.demo.App.model.Educacion;
import com.demo.App.service.IEducacion;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {
    
    List<Educacion> listaEducacion = new ArrayList();
    
    @Autowired
    private IEducacion eduServ;
    
    @PostMapping("/api/educacion/crear")
    public void crearEducacion(@RequestBody Educacion edu) {
        eduServ.crearEducacion(edu);
    }
    
    @GetMapping("/api/educacion/ver")
    @ResponseBody
    public List<Educacion> verEducacion() {
        return eduServ.verEducacion();
    }
    
    @GetMapping("/api/educacion/ver/{idEdu}")
    @ResponseBody
    public Educacion buscarEducacion(@PathVariable("idEdu") Long idEdu) {
        return eduServ.buscarEducacion(idEdu);
    }
    
    @DeleteMapping("/api/educacion/borrar/{idEdu}")
    public void borrarEducacion(@PathVariable Long idEdu) {
        eduServ.borrarEducacion(idEdu);
    }
    
    @PutMapping("/api/educacion/editar/{idEdu}")
    public Educacion editarEducacion(@PathVariable Long idEdu,
                                                @RequestParam("periodoEdu") String nuevoPeriodo,
                                                @RequestParam("tituloEdu") String nuevoTitulo,
                                                @RequestParam("institucionEdu") String nuevaInstitucion) {
        Educacion edu = eduServ.buscarEducacion(idEdu);
        edu.setPeriodoEdu(nuevoPeriodo);
        edu.setTituloEdu(nuevoTitulo);
        edu.setInstitucionEdu(nuevaInstitucion);
        
        eduServ.crearEducacion(edu);
        return edu;
}
    
}
