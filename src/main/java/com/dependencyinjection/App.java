package com.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dependencyinjection.entities.Pet;

/**
 * Hello world!
 *
 */
public class App {

    // Using ClassPathXmlApplicationContext , Xml File
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Pet pet = applicationContext.getBean("pet", Pet.class);
        
        pet.voice();

    }
}
