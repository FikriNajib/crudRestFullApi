/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.RestfullAPI.crudAPI.controller;

import com.example.RestfullAPI.crudAPI.entities.MotorEntities;
import com.example.RestfullAPI.crudAPI.repositories.MotorRepository;
import com.example.RestfullAPI.crudAPI.response.CommonResponse;
import com.example.RestfullAPI.crudAPI.response.CommonResponseGenerator;
import com.example.RestfullAPI.crudAPI.service.MotorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mo
 */
@RestController
@RequestMapping(value = "/motor")
public class MotorController {

    @Autowired
    MotorService motorService;

    @Autowired
    CommonResponseGenerator commonResponseGenerator;

    @GetMapping(value = "/cekApi")
    public CommonResponse<String> cekApi() {
        return commonResponseGenerator.successResponse("Api", "Success");
    }

    @PostMapping(value = "/addMotor")
    public CommonResponse<MotorEntities> addMotor(@RequestBody MotorEntities param) {
        try {
            MotorEntities motor = motorService.addMotor(param);
            return commonResponseGenerator.successResponse(param, "Success Add Motor");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(e.getMessage());
        }

    }

    @GetMapping(value = "/getAllMotor")
    public CommonResponse<List<MotorEntities>> getAllMotor() {
        try {
            List<MotorEntities> motorList = motorService.getAllMotor();
            return commonResponseGenerator.successResponse(motorList, "Success Get All Motor");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(e.getMessage());
        }

    }

    @GetMapping(value = "/getById")
    public CommonResponse<MotorEntities> getByd(@RequestParam int id) {
        try {
            MotorEntities motor = motorService.getMotorById(id);
            return commonResponseGenerator.successResponse(motor, "Success Get Id: " + id);

        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(e.getMessage());
        }

    }

    @PutMapping(value = "/updateMotor")
    public CommonResponse<MotorEntities> updateMotor(@RequestBody MotorEntities param) {
        try {
            MotorEntities motor = motorService.updateMotor(param);
            return commonResponseGenerator.successResponse(param, "Success Update Motor");

        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(e.getMessage()+"for Id: "+ param.getMotor_id());
        }

    }

    @DeleteMapping(value = "/deleteMotor")
    public CommonResponse<List<MotorEntities>> deleteMotor(@RequestParam int id) {
        try {
            motorService.deleteMotor(id);
            List<MotorEntities> motorList = motorService.getAllMotor();
            return commonResponseGenerator.successResponse(motorList, "Success Delete Motor Id: " + id);
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(e.getMessage());
        }
    }
}

