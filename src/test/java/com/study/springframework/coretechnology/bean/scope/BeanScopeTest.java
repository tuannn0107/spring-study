package com.study.springframework.coretechnology.bean.scope;

import com.study.springframework.AbstractSpringFrameworkStudyTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

public class BeanScopeTest extends AbstractSpringFrameworkStudyTest {
    @Test
    public void beanSingletonTest() {
        ApplicationContext applicationContext = getApplicationContext();
        BeanSingleton beanSingleton01 = applicationContext.getBean(BeanSingleton.class);
        BeanSingleton beanSingleton02 = applicationContext.getBean(BeanSingleton.class);
        Assert.assertEquals(beanSingleton01, beanSingleton02);
    }


    @Test
    public void beanPrototypeTest() {
        ApplicationContext applicationContext = getApplicationContext();
        BeanPrototype beanPrototype01 = applicationContext.getBean(BeanPrototype.class);
        BeanPrototype beanPrototype02 = applicationContext.getBean(BeanPrototype.class);
        Assert.assertNotEquals(beanPrototype01, beanPrototype02);
    }

    @Test
    public void beanAutowireTest() {
        ApplicationContext applicationContext = getApplicationContext();
        BeanSingleton beanSingleton01 = applicationContext.getBean(BeanSingleton.class);
        BeanPrototype beanPrototype01 = applicationContext.getBean(BeanPrototype.class);
        BeanDefault beanDefault = applicationContext.getBean(BeanDefault.class);
        BeanDefault2 beanDefault02 = applicationContext.getBean(BeanDefault2.class);

        // scope Singleton is init one time for container. All the bean is reference to the same object.
        BeanSingleton beanSingleton02 = beanDefault.getBeanSingleton();
        BeanSingleton beanSingleton03 = beanDefault02.getBeanSingleton();
        Assert.assertNotNull(beanSingleton02);
        Assert.assertNotNull(beanSingleton03);
        Assert.assertEquals(beanSingleton01, beanSingleton02);
        Assert.assertEquals(beanSingleton02, beanSingleton03);

        // scope PROTOTYPE will be init new instance when it is injected to another bean or getBean. Same as new Object()
        BeanPrototype beanPrototype02 = beanDefault.getBeanPrototype();
        BeanPrototype beanPrototype03 = beanDefault02.getBeanPrototype();
        Assert.assertNotNull(beanPrototype02);
        Assert.assertNotNull(beanPrototype03);
        Assert.assertNotEquals(beanPrototype01, beanPrototype02);
        Assert.assertNotEquals(beanPrototype02, beanPrototype03);
        Assert.assertNotEquals(beanPrototype01, beanPrototype03);
    }
}
