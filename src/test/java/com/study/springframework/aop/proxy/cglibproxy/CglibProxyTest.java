package com.study.springframework.aop.proxy.cglibproxy;

import com.study.springframework.AbstractSpringFrameworkStudyTest;
import com.study.springframework.utils.PrintStreamStorage;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

public class CglibProxyTest extends AbstractSpringFrameworkStudyTest {
    @Test
    public void cglibProxyTest() {
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(new AnimalMethodInterceptor());
        enhancer.setSuperclass(Animal.class);
        Animal animal = (Animal) enhancer.create();

        animal.sayHello();
        Assert.assertNotNull(PrintStreamStorage.getInstance().getPrintStreamStorage().get("Before invoke method sayHello"));
        Assert.assertNotNull(PrintStreamStorage.getInstance().getPrintStreamStorage().get("After invoke method sayHello"));
        PrintStreamStorage.getInstance().printStorage();
    }
}
