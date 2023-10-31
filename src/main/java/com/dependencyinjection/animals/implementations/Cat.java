package com.dependencyinjection.animals.implementations;

import com.dependencyinjection.animals.Animal;

public class Cat implements Animal {

    @Override
    public String voice() {
        return "Meow";
    }

}
