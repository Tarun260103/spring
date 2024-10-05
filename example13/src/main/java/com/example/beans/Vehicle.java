package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vehicleBean")
public class Vehicle {

    private String name ="Honda";
    private final com.example.services.VehicleServices vehicleServices;
    @Autowired
    public Vehicle(com.example.services.VehicleServices vehicleServices){
        this.vehicleServices=vehicleServices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public com.example.services.VehicleServices getVehicleServices() {
        return vehicleServices;
    }

    public void printHello(){
        System.out.println("printing Hello From component Vehicle bean");
    }
    @Override
    public String toString(){
        return "Vehicle name is - "+name;
    }
}
