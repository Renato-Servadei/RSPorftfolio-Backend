package com.demo.App.service;

import com.demo.App.exception.UserNotFoundException;
import com.demo.App.model.Hab_Duras;
import com.demo.App.repository.Hab_DurasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Hab_DurasService implements IHab_Duras{
    
    @Autowired
    public Hab_DurasRepository hab_dRepo;
    
    @Override
    public List<Hab_Duras> verHab_Duras() {
    return hab_dRepo.findAll();
    }

    @Override
    public void crearHab_Duras(Hab_Duras hab_d) {
        hab_dRepo.save(hab_d);
    }

    @Override
    public void borrarHab_Duras(Long idHab_d) {
        hab_dRepo.deleteById(idHab_d);
    }

    @Override
    public Hab_Duras buscarHab_Duras(Long idHab_d) {
        return hab_dRepo.findById(idHab_d).orElseThrow(()-> new UserNotFoundException("usuario no encontrado")  );
    }

    @Override
    public Hab_Duras editarHab_Duras(Hab_Duras hab_d) {
        return hab_dRepo.save(hab_d);
    }
    
}
