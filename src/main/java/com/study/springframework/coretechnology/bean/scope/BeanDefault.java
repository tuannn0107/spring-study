package com.study.springframework.coretechnology.bean.scope;

import com.study.springframework.coretechnology.bean.BeanPrototype;
import com.study.springframework.coretechnology.bean.BeanSingleton;
import com.study.springframework.coretechnology.bean.IBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanDefault implements IBean {
    private BeanPrototype beanPrototype;
    private BeanSingleton beanSingleton;

    @Autowired
    public void setBeanPrototype(BeanPrototype beanPrototype) {
        this.beanPrototype = beanPrototype;
    }

    @Autowired
    public void setBeanSingleton(BeanSingleton beanSingleton) {
        this.beanSingleton = beanSingleton;
    }

    @Override
    public void sayHi() {
        System.out.println("Hello " + this.getClass().toString());
    }

    public BeanPrototype getBeanPrototype() {
        return beanPrototype;
    }

    public BeanSingleton getBeanSingleton() {
        return beanSingleton;
    }
}
