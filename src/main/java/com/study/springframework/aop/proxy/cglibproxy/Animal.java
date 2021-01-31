package com.study.springframework.aop.proxy.cglibproxy;

import com.study.springframework.utils.PrintStreamStorage;

public class Animal {
    public void sayHello() {
        PrintStreamStorage.getInstance().println("Call sayHello " + this.getClass().getSimpleName());
    }
}
