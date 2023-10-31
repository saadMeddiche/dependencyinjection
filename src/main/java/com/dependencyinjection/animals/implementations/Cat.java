package com.dependencyinjection.animals.implementations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.dependencyinjection.animals.Animal;

@Component
public class Cat implements Animal {

    @Override
    public String voice() {
        return "Meow";
    }

}
