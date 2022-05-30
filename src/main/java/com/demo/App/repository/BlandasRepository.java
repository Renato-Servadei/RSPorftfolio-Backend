package com.demo.App.repository;

import com.demo.App.model.Hab_Blandas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Hab_BlandasRepository extends JpaRepository <Hab_Blandas,Long>{
    
}
