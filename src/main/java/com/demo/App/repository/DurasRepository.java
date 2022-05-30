package com.demo.App.repository;

import com.demo.App.model.Hab_Duras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Hab_DurasRepository extends JpaRepository <Hab_Duras,Long>{
    
}
