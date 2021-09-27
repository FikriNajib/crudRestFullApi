/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.RestfullAPI.crudAPI.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Mo
 */
@Entity
@Table(name = "motor")
public class MotorEntities implements Serializable{

      private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "motor_id")
    private Integer motor_id;
    
    @Column(name = "motor_name")
    private String motor_name;
        
    @Column(name = "type")
    private String type;

    @Column(name = "price")
    private Integer price;

    @Column(name = "brand")
    private String brand;
    
    public Integer getMotor_id() {
        return motor_id;
    }

    public void setMotor_id(Integer motor_id) {
        this.motor_id = motor_id;
    }

    public String getMotor_name() {
        return motor_name;
    }

    public void setMotor_name(String motor_name) {
        this.motor_name = motor_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "MotorEntities{" + "motor_id=" + motor_id + ", motor_name=" + motor_name + ", type=" + type + ", price=" + price + ", brand=" + brand + '}';
    }
    
  
    
    
    
    
    
}
