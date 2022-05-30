package com.demo.App.service;

import com.demo.App.exception.UserNotFoundException;
import com.demo.App.model.Certificaciones;
import com.demo.App.repository.CertificacionesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificacionesService implements ICertificaciones {
 
    
    @Autowired
    public CertificacionesRepository certRepo;

    @Override
    public List<Certificaciones> verCertificaciones() {
        return certRepo.findAll();
    }

    @Override
    public void crearCertificacion(Certificaciones cert) {
        certRepo.save(cert);
    }

    @Override
    public void borrarCertificacion(Long idCer) {
        certRepo.deleteById(idCer);
    }

    @Override
    public Certificaciones buscarCertificacion(Long idCer) {
        return certRepo.findById(idCer).orElseThrow(()-> new UserNotFoundException("elemento no encontrado")  );
    }

    @Override
    public Certificaciones editarCertificacion(Certificaciones cert) {
        return certRepo.save(cert);
    }
    
}
