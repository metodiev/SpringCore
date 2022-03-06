package com.example.springbeans.demo.createbeans.hooks;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class CarComponentBean {

    @Autowired
    private Car car;

    @PostConstruct
    public void pre() {
        System.out.println("Postconstructor");
        car.setCarModel("Na bat Pesho Kamdjiqta");
        System.out.println( car.toString());
    }

    @PreDestroy
    public void post() {
        System.out.println("Predestroy");
    }

    public void getSomeFiled() {
        System.out.println("Some filed from Post Predestroy");
    }

}
