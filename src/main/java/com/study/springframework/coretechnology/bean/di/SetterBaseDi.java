package com.study.springframework.coretechnology.bean.di;

import com.study.springframework.coretechnology.bean.BeanSingleton;
import com.study.springframework.services.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterBaseDi {
    private BeanSingleton beanSingleton;

    /**
     * The dependency will be injected when init the bean through setter method
     * @param beanSingleton
     */
    @Autowired
    public void setBeanSingleton(BeanSingleton beanSingleton) {
        this.beanSingleton = beanSingleton;
    }

    public BeanSingleton getBeanSingleton() {
        return beanSingleton;
    }
}
