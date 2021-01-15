package com.study.springframework.coretechnology.bean.di;


import org.springframework.stereotype.Component;

@Component
public class BeanA {
    public BeanA() {
        System.out.println("Initialize bean A!!!!");
    }
}
