package com.study.springframework;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Objects;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfiguration.class})
public class AbstractSpringFrameworkStudyTest implements ApplicationContextAware {
    private ApplicationContext applicationContext;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }


    @Test
    public void test() {
        System.out.println(Objects.equals(null, null));
        System.out.println(Objects.equals("", null));
        System.out.println(Objects.equals(null, ""));
        System.out.println(Objects.equals("", ""));
        System.out.println(Objects.equals("aa", "aa"));
        System.out.println(Objects.equals("aa", "AA"));
    }
}
