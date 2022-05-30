package com.demo.App.repository;

import com.demo.App.model.Duras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DurasRepository extends JpaRepository <Duras,Long>{
    
}
