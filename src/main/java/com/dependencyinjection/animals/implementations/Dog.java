package com.dependencyinjection.animals.implementations;

import com.dependencyinjection.animals.Animal;

public class Dog implements Animal {

    @Override
    public String voice() {
        return "Woof";
    }
}
