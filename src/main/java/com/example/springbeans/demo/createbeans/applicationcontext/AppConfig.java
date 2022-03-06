package com.example.springbeans.demo.createbeans.applicationcontext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.springbeans.demo.createbeans.applicationcontext")
public class AppConfig {

    @Bean
    public Car carBeanCreatedIntoAppConfig(){
        return new Car();
    }
}
