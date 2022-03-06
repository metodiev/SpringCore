package com.example.springbeans.demo.createbeans.constructorinjection.registeranotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan(basePackageClasses = {CarComponentBean.class, next class, next claass and etc...})
@ComponentScan(basePackages = {"com.example.springbeans.demo.createbeans.constructorinjection.registeranotation"})

public interface AppConfigTest {

}
