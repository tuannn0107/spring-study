package com.study.springframework.coretechnology.bean.di;

import com.study.springframework.coretechnology.bean.BeanSingleton;
import com.study.springframework.coretechnology.bean.IBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AutowiredBean {
    @Autowired
    private BeanSingleton beanSingleton;

    @Autowired
    @Qualifier("beanDefault2")
    private IBean ibean;

    @Autowired
    private IBean beanDefault;

    public AutowiredBean() {
        //System.out.println("Inti bean!!!!");
    }

    @PostConstruct
    public void postConstruc() {
        beanSingleton.sayHi();
    }

    public IBean getBeanDefault() {
        return beanDefault;
    }

    public IBean getIbean() {
        return ibean;
    }
}
