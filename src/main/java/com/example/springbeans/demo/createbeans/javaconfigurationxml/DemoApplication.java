package com.example.springbeans.demo.createbeans.javaconfigurationxml;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {
    public static void main(String[] args) {
        //create new annotation config app obj
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //get from app context (IoC container ) the Car object
        CarComponentBean carObj = context.getBean("carObj", CarComponentBean.class);
        //get some field value from car object, bear in mind that it is not necessary this filed to be implemented
        //you need only the object to be created
        System.out.println(carObj.getCarModel());
        System.out.println(carObj.getCarEngine());
    }
}
