package com.study.springframework.aop.proxy;

import org.springframework.aop.framework.AopContext;

public class SimplePojo implements Pojo {
    public void foo() {
        ((Pojo) AopContext.currentProxy()).bar();
    }

    @Override
    public void bar() {

    }
}
