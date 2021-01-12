package com.study.springframework.coretechnology.bean.lazy;

import com.study.springframework.AbstractSpringFrameworkStudyTest;
import com.study.springframework.coretechnology.bean.lazy.Animal;
import org.junit.Test;

public class LazyInitializeBeanTest extends AbstractSpringFrameworkStudyTest {

    @Test
    public void lazyInitBeantest() {
        System.out.println("Before get bean");
        Animal animal1 = getApplicationContext().getBean(Animal.class);
        System.out.println("after get bean");
        animal1.sayHello();
    }
}
