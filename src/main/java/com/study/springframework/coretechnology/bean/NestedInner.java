package com.study.springframework.coretechnology.bean;

import org.springframework.stereotype.Component;

@Component
public class NestedInner {
    private String name;

    @Component
    public class NestedClass {
        public void sayHello() {
            System.out.println("Hello World nested!!!!");
        }
    }
}
