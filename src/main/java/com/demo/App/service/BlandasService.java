package com.demo.App.service;

import com.demo.App.exception.UserNotFoundException;
import com.demo.App.model.Blandas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.App.repository.BlandasRepository;

@Service
public class BlandasService implements IBlandas{

    @Autowired
    public BlandasRepository blandasRepo;
    
    @Override
    public List<Blandas> verBlandas() {
    return blandasRepo.findAll();
    }

    @Override
    public void crearBlandas(Blandas blandas) {
       blandasRepo.save(blandas);
    }

    @Override
    public void borrarBlandas(Long idBlandas) {
        blandasRepo.deleteById(idBlandas);
    }

    @Override
    public Blandas buscarBlandas(Long idBlandas) {
        return blandasRepo.findById(idBlandas).orElseThrow(()-> new UserNotFoundException("usuario no encontrado")  );
    }

    @Override
    public Blandas editarBlandas(Blandas blandas) {
        return blandasRepo.save(blandas);
    }
    
    
}
