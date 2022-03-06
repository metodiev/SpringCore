package com.example.springbeans.demo.createbeans.hooks;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.example.springbeans.demo.createbeans.hook")
@ComponentScan(basePackageClasses = {CarComponentBean.class})
public interface AppConfig {

}
