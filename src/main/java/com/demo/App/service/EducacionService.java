package com.demo.App.service;

import com.demo.App.exception.UserNotFoundException;
import com.demo.App.model.Educacion;
import com.demo.App.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EducacionService implements IEducacion {
    
    @Autowired
    public EducacionRepository eduRepo;

    @Override
    public List<Educacion> verEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long idEdu) {
        eduRepo.deleteById(idEdu);
    }

    @Override
    public Educacion buscarEducacion(Long idEdu) {
        return eduRepo.findById(idEdu).orElseThrow(()-> new UserNotFoundException("usuario no encontrado")  );
    }

    @Override
    public Educacion editarEducacion(Educacion edu) {
        return eduRepo.save(edu);
    }
    
}
