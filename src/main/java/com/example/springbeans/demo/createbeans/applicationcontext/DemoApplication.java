package com.example.springbeans.demo.createbeans.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {
    public static void main(String[] args) {
        //create new annotation config app obj
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //get from app context (IoC container ) the Car object
        Car carObj = context.getBean(Car.class);
        //get some field value from car object, bear in mind that it is not necessary this filed to be implemented
        //you need only the object to be created
        System.out.println(carObj.getCarModel());
    }
}
