package com.dependencyinjection.configurations;

import org.springframework.context.annotation.Bean;

import com.dependencyinjection.animals.implementations.Cat;
import com.dependencyinjection.animals.implementations.Dog;
import com.dependencyinjection.entities.Pet;

public class AppConfig {

    @Bean(name = "cat")
    public Cat adobtCat() {
        return new Cat();
    }

    @Bean(name = "dog")
    public Dog adobtDog() {
        return new Dog();
    }

    @Bean(name = "pet")
    public Pet adobtPet() {
        return new Pet(adobtDog());
    }

}
