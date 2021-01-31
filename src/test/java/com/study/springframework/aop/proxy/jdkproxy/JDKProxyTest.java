package com.study.springframework.aop.proxy.jdkproxy;

import com.study.springframework.AbstractSpringFrameworkStudyTest;
import com.study.springframework.aop.proxy.IPersonService;
import com.study.springframework.aop.proxy.PersonServiceImpl;
import com.study.springframework.utils.PrintStreamStorage;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Proxy;

public class JDKProxyTest extends AbstractSpringFrameworkStudyTest {
    @Test
    public void jdkProxyTest() {
        IPersonService personService = (IPersonService) Proxy.newProxyInstance(
                IPersonService.class.getClassLoader(), PersonServiceImpl.class.getInterfaces(),
                new PersionServiceInvocationHandler(new PersonServiceImpl()));

        personService.sayHello();
        Assert.assertNotNull(PrintStreamStorage.getInstance().getPrintStreamStorage().get("Before invoke method sayHello"));
        Assert.assertNotNull(PrintStreamStorage.getInstance().getPrintStreamStorage().get("After invoke method sayHello"));
        Assert.assertTrue(PrintStreamStorage.getInstance().getPrintStreamStorage().get("Before invoke method sayHello")
                        < PrintStreamStorage.getInstance().getPrintStreamStorage().get("Call sayHello PersonServiceImpl"));
        Assert.assertTrue(PrintStreamStorage.getInstance().getPrintStreamStorage().get("Call sayHello PersonServiceImpl")
                        < PrintStreamStorage.getInstance().getPrintStreamStorage().get("After invoke method sayHello"));
    }
}
