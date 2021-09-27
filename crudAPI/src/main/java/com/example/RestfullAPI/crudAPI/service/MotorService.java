/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.RestfullAPI.crudAPI.service;

import com.example.RestfullAPI.crudAPI.entities.MotorEntities;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Mo
 */
@Component
public interface MotorService {

    public MotorEntities addMotor(MotorEntities param);

    public List<MotorEntities> getAllMotor();

    public MotorEntities getMotorById(int id);

    public MotorEntities updateMotor(MotorEntities param);

    public void deleteMotor(int id);
    
}
