package com.demo.App.controller;

import com.demo.App.model.Certificaciones;
import com.demo.App.service.ICertificaciones;
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
@RequestMapping("/api/certificaciones")
@CrossOrigin(origins="http://localhost:4200")

public class CertificacionesController {
    List<Certificaciones> listaCertificaciones = new ArrayList();
    
    @Autowired
    private ICertificaciones certServ;
    
    @PostMapping
    public void crearCertificacion(@RequestBody Certificaciones cert) {
        certServ.crearCertificacion(cert);
    }
    
    @GetMapping
    @ResponseBody
    public List<Certificaciones> verCertificaciones() {
        return certServ.verCertificaciones();
    }
    
    @GetMapping("/{idCer}")
    @ResponseBody
    public Certificaciones buscarCertificacion(@PathVariable("idCer") Long idCer) {
        return certServ.buscarCertificacion(idCer);
    }
    
    @DeleteMapping("/{idCer}")
    public void borrarCertificacion(@PathVariable Long idCer) {
        certServ.borrarCertificacion(idCer);
    }
    
    @PutMapping
    public ResponseEntity <Certificaciones> editarCertificacion(@RequestBody Certificaciones cert) {
        Certificaciones editarCertificacion = certServ.editarCertificacion(cert);
        return new ResponseEntity <> (editarCertificacion, HttpStatus.OK);
                    
}
}
