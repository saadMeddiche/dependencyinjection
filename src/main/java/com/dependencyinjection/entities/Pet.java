package com.dependencyinjection.entities;

import com.dependencyinjection.animals.Animal;

public class Pet {

    private Animal animal;

    public Pet() {
    }

    public Pet(Animal animal) {
        this.animal = animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void voice() {
        System.out.println(animal.voice());
    }
}
