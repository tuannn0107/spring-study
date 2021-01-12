package com.study.springframework.coretechnology.bean.lazy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Lazy
public class Animal {
    private String name;
    private String type;

    @PostConstruct
    @Lazy
    public void postConstructs() {
        System.out.println("Postconstruct initialed!!");
    }

    public Animal() {
        System.out.println("animal initialed!!!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void sayHello() {
        System.out.println("Hello World!!!!");
    }
}
