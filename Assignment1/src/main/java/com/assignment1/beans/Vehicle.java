package com.assignment1.beans;

import com.assignment1.services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="vehicleBean")
public class Vehicle {
    private String vehicleName;
    private final VehicleServices vehService;

    @Autowired
    public Vehicle(VehicleServices vehService) {
        this.vehService = vehService;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public VehicleServices getVehService() {
        return vehService;
    }

//    public void setVehService(VehicleServices vehService) {
//        this.vehService = vehService;
//    }
}
