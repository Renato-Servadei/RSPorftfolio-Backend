package com.demo.App.repository;

import com.demo.App.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProyectosRepository extends JpaRepository<Proyectos,Long>{
    
}
