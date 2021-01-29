package com.study.springframework.aop.pointcut;

import com.study.springframework.utils.PrintStreamStorage;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@Aspect
public class PointCutConfig {

    @Pointcut("execution(public * insert*(..))")
    public void transactionDBMock() {}

    @Before("transactionDBMock()")
    public void beforeTransactionDBMock(JoinPoint jp) {
        PrintStreamStorage.getInstance().println("Execute before method " + jp.getSignature().getName());
    }

    @After("transactionDBMock()")
    public void afterTransactionDBMock(JoinPoint jp) {
        PrintStreamStorage.getInstance().println("Execute after method " + jp.getSignature().getName());
    }
}
