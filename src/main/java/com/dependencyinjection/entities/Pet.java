package com.dependencyinjection.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dependencyinjection.animals.Animal;
import com.dependencyinjection.animals.implementations.Cat;
import com.dependencyinjection.animals.implementations.Dog;

@Component
public class Pet {

    private Animal animal;

    public Pet() {
    }

    public Pet(Animal animal) {
        this.animal = animal;
    }

    @Autowired
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    // AutoWiring By Name
    // @Autowired
    // public void setAnimal(Animal cat) {
    // this.animal = cat;
    // }

    // // AutoWiring By Type
    // @Autowired
    // public void setAnimal(Dog animal) {
    // this.animal = animal;
    // }

    public void voice() {
        System.out.println(animal.voice());
    }
}
