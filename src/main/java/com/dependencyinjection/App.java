package com.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dependencyinjection.configurations.AppConfig;
import com.dependencyinjection.entities.Pet;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        dependencieinjectionUsingXml();
        // dependencieinjectionUsingJavaConfig();
    }

    public static void dependencieinjectionUsingXml() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Pet pet = applicationContext.getBean("pet", Pet.class);

        pet.voice();
    }

    public static void dependencieinjectionUsingJavaConfig() {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Pet pet = applicationContext.getBean("pet-DIusingSetter", Pet.class);

        pet.voice();
    }
}
