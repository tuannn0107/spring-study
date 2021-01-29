package com.study.springframework.coretechnology.bean.di;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircularBeanB {
    @Autowired
    private CircularBeanA circularBeanA;

    public CircularBeanB() {
        //System.out.println("Initial " + this.getClass());
    }

    public CircularBeanA getCircularBeanA() {
        return circularBeanA;
    }

    public void callBeanA() {

    }


    public void sayHi() {
        System.out.println("Say Hi from " + this.getClass());
    }
}
