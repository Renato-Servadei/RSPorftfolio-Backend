package com.demo.App.repository;

import com.demo.App.model.Blandas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BlandasRepository extends JpaRepository <Blandas,Long>{
    
}
