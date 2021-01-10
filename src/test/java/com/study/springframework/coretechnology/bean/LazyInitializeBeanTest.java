package com.study.springframework.coretechnology.bean;

import com.study.springframework.AbstractSpringFrameworkStudyTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

public class LazyInitializeBeanTest extends AbstractSpringFrameworkStudyTest {

    @Test
    public void lazyInitBeantest() {
        System.out.println("Before get bean");
        Animal animal1 = getApplicationContext().getBean(Animal.class);
        System.out.println("after get bean");
        animal1.sayHello();
    }
}
