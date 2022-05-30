package com.demo.App.service;

import com.demo.App.exception.UserNotFoundException;
import com.demo.App.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.App.repository.PersonaRepository;

@Service
public class PersonaService implements IPersona{

    @Autowired
    public PersonaRepository usuRepo;
    
    @Override
    public List<Persona> verPersona() {
        return usuRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        usuRepo.save(per);
    }

    @Override
    public void borrarPersona(Long idPer) {
        usuRepo.deleteById(idPer);
    }

    @Override
    public Persona buscarPersona(Long idPer) {
        return usuRepo.findById(idPer).orElseThrow(()-> new UserNotFoundException("usuario no encontrado")  );
    }

    @Override
    public Persona editarPersona(Persona per) {
        return usuRepo.save(per);
    }
    
}
