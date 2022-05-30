package com.demo.App.repository;

import com.demo.App.model.Certificaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificacionesRepository extends JpaRepository <Certificaciones, Long>{

    
}
