package com.study.springframework.coretechnology.bean.di;

import com.study.springframework.AbstractSpringFrameworkStudyTest;
import com.study.springframework.coretechnology.bean.BeanSingleton;
import com.study.springframework.coretechnology.bean.IBean;
import com.study.springframework.coretechnology.bean.scope.BeanDefault;
import com.study.springframework.coretechnology.bean.scope.BeanDefault2;
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

    @Test
    public void dependsOnTest() {
        // The bean A must be initialize before bean AnnotationDependsOnBean
        ApplicationContext applicationContext = getApplicationContext();
    }
    
    @Test
    public void autowireBeanMoreThanOneBeanTest() {
        ApplicationContext applicationContext = getApplicationContext();
        IBean beanDefault = applicationContext.getBean(AutowiredBean.class).getBeanDefault();
        IBean beanDefault2 = applicationContext.getBean(AutowiredBean.class).getIbean();
        Assert.assertTrue(beanDefault instanceof BeanDefault);
        Assert.assertTrue(beanDefault2 instanceof BeanDefault2);
    }
}
