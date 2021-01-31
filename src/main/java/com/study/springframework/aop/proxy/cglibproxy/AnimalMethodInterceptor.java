package com.study.springframework.aop.proxy.cglibproxy;


import com.study.springframework.utils.PrintStreamStorage;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class AnimalMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        PrintStreamStorage.getInstance().println("Before invoke method " + method.getName());
        Object result = methodProxy.invokeSuper(object, args);
        PrintStreamStorage.getInstance().println("After invoke method " + method.getName());
        return result;
    }
}
