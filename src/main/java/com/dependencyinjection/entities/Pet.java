package com.dependencyinjection.entities;

import com.dependencyinjection.animals.Animal;

public class Pet {

    private Animal animal;

    Pet(Animal animal) {
        this.animal = animal;
    }

    public void voice() {
        System.out.println(animal.voice());
    }
}