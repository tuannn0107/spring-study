package com.study.springframework.coretechnology.bean.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
public class CircularBeanA {
    @Autowired
    private CircularBeanB circularBeanB;

    public CircularBeanA() {
        //System.out.println("Initial " + this.getClass());
    }

    public void callBeanB() {
    }

    public void sayHi() {
        System.out.println("Say Hi from " + this.getClass());
    }

    public CircularBeanB getCircularBeanB() {
        return circularBeanB;
    }
}
