package com.dependencyinjection.animals.implementations;

import org.springframework.stereotype.Component;

import com.dependencyinjection.animals.Animal;

@Component
public class Dog implements Animal {

    @Override
    public String voice() {
        return "Woof";
    }
}
