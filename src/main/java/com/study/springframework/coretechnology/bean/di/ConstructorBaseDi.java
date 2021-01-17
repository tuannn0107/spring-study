package com.study.springframework.coretechnology.bean.di;

import com.study.springframework.coretechnology.bean.BeanSingleton;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
public class ConstructorBaseDi {
    private BeanSingleton beanSingleton;

    /**
     * Constructor inject. Spring will inject the dependency when the bean initialized
     * @param beanSingleton
     */
    public ConstructorBaseDi(BeanSingleton beanSingleton) {
        this.beanSingleton = beanSingleton;
    }

    public BeanSingleton getBeanSingleton() {
        return beanSingleton;
    }
}
