package com.assignment1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.assignment1.implementations", "com.assignment1.beans", "com.assignment1.services"})
@ComponentScan(basePackageClasses = {com.assignment1.beans.Vehicle.class, com.assignment1.beans.Person.class})
public class ProjectConfig {
}
