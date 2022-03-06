package com.example.springbeans.demo.createbeans.applicationcontext;

/*
This class will represent POJO (Bean about application context)
 */
public class Car {
    private String carColor;
    /*
    This field has been initialised only for test purpose
     */
    private String carModel = "Na bat pesho ladata";
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
}
