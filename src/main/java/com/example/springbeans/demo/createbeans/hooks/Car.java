package com.example.springbeans.demo.createbeans.hooks;

import org.springframework.stereotype.Component;

/*
This class will represent POJO (Bean about application context)
 */
@Component
public class Car {
    private String carColor;
    private String carModel;
    private String carEngine;

    public Car() {
        System.out.println("Car Object has been created");
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

    @Override
    public String toString() {
        return "Car{" +
                "carColor='" + carColor + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carEngine='" + carEngine + '\'' +
                '}';
    }
}
