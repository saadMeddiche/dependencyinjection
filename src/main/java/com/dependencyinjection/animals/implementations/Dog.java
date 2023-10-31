package com.dependencyinjection.animals.implementations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.dependencyinjection.animals.Animal;

@Component
@Primary
public class Dog implements Animal {

    @Override
    public String voice() {
        return "Woof";
    }
}
