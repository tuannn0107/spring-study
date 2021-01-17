package com.study.springframework.coretechnology.bean.di;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn({"beanA"})
public class AntonationDependsOnBean {
    public AntonationDependsOnBean() {
        System.out.println("Initialize bean DependsOnBean!!!!");
    }
}
