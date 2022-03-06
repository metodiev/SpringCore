package com.example.springbeans.demo.createbeans.propertyinjection.registeranotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarComponentBean {
    private String carColor;
    /*
    This field has been initialised only for test purpose
     */
    private String carModel = "Na bat pesho ladata";
    private String carEngine;
    private Car car;

    public Car getCar() {
        return car;
    }

    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }

    public CarComponentBean(Car car) {
        System.out.println("CarComponentBean Object has been created");
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(String carEngine) {
        this.carEngine = carEngine;
    }
}
