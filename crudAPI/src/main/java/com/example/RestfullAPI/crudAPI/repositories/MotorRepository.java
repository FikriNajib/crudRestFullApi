/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.RestfullAPI.crudAPI.repositories;

import com.example.RestfullAPI.crudAPI.entities.MotorEntities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mo
 */
@Repository
public interface MotorRepository extends JpaRepository<MotorEntities, Integer>{
    
}

