package com.assignment1.main;

import com.assignment1.beans.Person;
import com.assignment1.beans.Vehicle;
import com.assignment1.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Assignment1 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);
//String[] names = context.getBeanNamesForType(Vehicle.class);
//Vehicle veh = context.getBean(Vehicle.class);
//
//veh.getVehService().playMusic();
//veh.getVehService().moveVehicle();

//        Instead of getting veh by the context, it can be achieved from the Person bean as the Person is dependent on Vehicle
        person.getVehicle().getVehService().playMusic();
        person.getVehicle().getVehService().moveVehicle();

    }
}
