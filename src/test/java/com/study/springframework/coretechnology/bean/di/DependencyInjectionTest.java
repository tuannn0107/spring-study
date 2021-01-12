package com.study.springframework.coretechnology.bean.di;

import com.study.springframework.AbstractSpringFrameworkStudyTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

public class DependencyInjectionTest extends AbstractSpringFrameworkStudyTest {
    @Test
    public void contructorBaseDITest() {
        ApplicationContext applicationContext = getApplicationContext();
        ConstructorBaseDi constructorBaseDi = applicationContext.getBean(ConstructorBaseDi.class);
        Assert.assertNotNull(constructorBaseDi);
        Assert.assertNotNull(constructorBaseDi.getBeanSingleton());
        constructorBaseDi.getBeanSingleton().sayHi();
    }


    @Test
    public void setterBaseDITest() {
        ApplicationContext applicationContext = getApplicationContext();
        SetterBaseDi setterBaseDi = applicationContext.getBean(SetterBaseDi.class);
        Assert.assertNotNull(setterBaseDi);
        Assert.assertNotNull(setterBaseDi.getBeanSingleton());
        setterBaseDi.getBeanSingleton().sayHi();
    }


    @Test
    public void autowireTest() {
        ApplicationContext applicationContext = getApplicationContext();
        AutowiredBean autowiredBean = applicationContext.getBean(AutowiredBean.class);
    }

    @Test
    public void circularDependencyTest() {
        ApplicationContext applicationContext = getApplicationContext();
    }
}
