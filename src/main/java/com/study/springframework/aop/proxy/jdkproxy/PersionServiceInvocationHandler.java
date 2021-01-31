package com.study.springframework.aop.proxy.jdkproxy;

import com.study.springframework.aop.proxy.IPersonService;
import com.study.springframework.utils.PrintStreamStorage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersionServiceInvocationHandler implements InvocationHandler {
    private final IPersonService target;

    public PersionServiceInvocationHandler(IPersonService target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        PrintStreamStorage.getInstance().println("Before invoke method " + method.getName());
        Object result = method.invoke(target, args);
        PrintStreamStorage.getInstance().println("After invoke method " + method.getName());
        return result;
    }
}
