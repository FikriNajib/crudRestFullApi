/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.RestfullAPI.crudAPI.service;

import com.example.RestfullAPI.crudAPI.entities.MotorEntities;
import com.example.RestfullAPI.crudAPI.repositories.MotorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mo
 */
@Service
public class MotorServiceImpl implements MotorService {

    @Autowired
    MotorRepository motorRepository;

    @Override
    public MotorEntities addMotor(MotorEntities param) {
        return motorRepository.save(param);
    }

    @Override
    public List<MotorEntities> getAllMotor() {
        return motorRepository.findAll();
    }

    @Override
    public MotorEntities getMotorById(int id) {
        return motorRepository.findById(id).get();
    }

    @Override
    public MotorEntities updateMotor(MotorEntities param) {
        MotorEntities findMotor = motorRepository.findById(param.getMotor_id()).get();
        findMotor.setMotor_name(param.getMotor_name());
        findMotor.setType(param.getType());
        findMotor.setPrice(param.getPrice());
        findMotor.setBrand(param.getBrand());
                
        return motorRepository.save(findMotor);
    }

    @Override
    public void deleteMotor(int id) {
        motorRepository.deleteById(id);
    }

}
