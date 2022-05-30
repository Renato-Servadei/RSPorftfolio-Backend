package com.demo.App.service;

import com.demo.App.exception.UserNotFoundException;
import com.demo.App.model.Duras;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.App.repository.DurasRepository;


@Service
public class DurasService implements IDuras{
    
    @Autowired
    public DurasRepository durasRepo;
    
    @Override
    public List<Duras> verDuras() {
    return durasRepo.findAll();
    }

    @Override
    public void crearDuras(Duras duras) {
        durasRepo.save(duras);
    }

    @Override
    public void borrarDuras(Long idDuras) {
        durasRepo.deleteById(idDuras);
    }

    @Override
    public Duras buscarDuras(Long idDuras) {
        return durasRepo.findById(idDuras).orElseThrow(()-> new UserNotFoundException("usuario no encontrado")  );
    }

    @Override
    public Duras editarDuras(Duras duras) {
        return durasRepo.save(duras);
    }
    
}
