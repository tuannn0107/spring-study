package com.study.springframework.coretechnology.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanCallback implements InitializingBean, DisposableBean, BeanNameAware {
    public BeanCallback() {
        //System.out.println("Initial BeanCallback!!!!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //System.out.println("Initialization BeanCallback!!!!");
    }

    @Override
    public void destroy() throws Exception {
        //System.out.println("Disposable BeanCallback!!!!");
    }


    @Override
    public void setBeanName(String name) {

    }
}
