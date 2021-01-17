package com.study.springframework.coretechnology.bean.di;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
    public BeanB() {
        System.out.println("Initialize bean B!!!!");
    }
}
