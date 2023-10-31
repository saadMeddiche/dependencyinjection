package com.dependencyinjection.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.dependencyinjection.animals.implementations.Cat;
import com.dependencyinjection.animals.implementations.Dog;
import com.dependencyinjection.entities.Pet;

// @ComponentScan(basePackageClasses = { Cat.class, Dog.class, Pet.class })
@ComponentScan(basePackages = "com.dependencyinjection.*")

public class AppConfig {

    // @Bean(name = "cat")
    // public Cat adobtCat() {
    // return new Cat();
    // }

    // @Bean(name = "dog")
    // public Dog adobtDog() {
    // return new Dog();
    // }

    // DI -> Dependency Injection
    // @Bean(name = "pet-DIusingConstructor")
    // public Pet adobtPet1() {
    // return new Pet(adobtDog());
    // }

    // @Bean(name = "pet-DIusingSetter")
    // public Pet adobtPet2() {
    // Pet pet = new Pet();
    // pet.setAnimal(adobtCat());
    // return pet;
    // }

}
