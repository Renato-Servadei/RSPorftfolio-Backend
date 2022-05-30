package com.demo.App.service;

import com.demo.App.exception.UserNotFoundException;
import com.demo.App.model.Hab_Blandas;
import com.demo.App.repository.Hab_BlandasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Hab_BlandasService implements IHab_Blandas{

    @Autowired
    public Hab_BlandasRepository hab_bRepo;
    
    @Override
    public List<Hab_Blandas> verHab_Blandas() {
    return hab_bRepo.findAll();
    }

    @Override
    public void crearHab_Blandas(Hab_Blandas hab_b) {
       hab_bRepo.save(hab_b);
    }

    @Override
    public void borrarHab_Blandas(Long idHab_b) {
        hab_bRepo.deleteById(idHab_b);
    }

    @Override
    public Hab_Blandas buscarHab_Blandas(Long idHab_b) {
        return hab_bRepo.findById(idHab_b).orElseThrow(()-> new UserNotFoundException("usuario no encontrado")  );
    }

    @Override
    public Hab_Blandas editarHab_Blandas(Hab_Blandas hab_b) {
        return hab_bRepo.save(hab_b);
    }
    
    
}
