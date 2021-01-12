package com.study.springframework.coretechnology.bean.di;

import com.study.springframework.coretechnology.bean.BeanSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AutowiredBean {
    @Autowired
    private BeanSingleton beanSingleton;

    public AutowiredBean() {
        System.out.println("Inti bean!!!!");
    }

    @PostConstruct
    public void postConstruc() {
        beanSingleton.sayHi();
    }
}
