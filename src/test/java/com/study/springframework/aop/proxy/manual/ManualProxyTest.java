package com.study.springframework.aop.proxy.manual;

import com.study.springframework.AbstractSpringFrameworkStudyTest;
import com.study.springframework.aop.proxy.IPersonService;
import com.study.springframework.aop.proxy.PersonServiceImpl;
import com.study.springframework.utils.PrintStreamStorage;
import org.junit.Assert;
import org.junit.Test;

public class ManualProxyTest extends AbstractSpringFrameworkStudyTest {
    @Test
    public void manualProxyTest() {
        IPersonService personService = new PersonServiceProxy(new PersonServiceImpl());

        personService.sayHello();
        Assert.assertNotNull(PrintStreamStorage.getInstance().getPrintStreamStorage().get("Before sayHello. PersonServiceProxy"));
        Assert.assertNotNull(PrintStreamStorage.getInstance().getPrintStreamStorage().get("Call sayHello PersonServiceImpl"));
        Assert.assertNotNull(PrintStreamStorage.getInstance().getPrintStreamStorage().get("After sayHello. PersonServiceProxy"));
        Assert.assertTrue(PrintStreamStorage.getInstance().getPrintStreamStorage().get("Before sayHello. PersonServiceProxy")
                            < PrintStreamStorage.getInstance().getPrintStreamStorage().get("Call sayHello PersonServiceImpl"));
        Assert.assertTrue(PrintStreamStorage.getInstance().getPrintStreamStorage().get("Call sayHello PersonServiceImpl")
                            < PrintStreamStorage.getInstance().getPrintStreamStorage().get("After sayHello. PersonServiceProxy"));

        personService.findPerson();
        Assert.assertNotNull(PrintStreamStorage.getInstance().getPrintStreamStorage().get("Before findPerson. PersonServiceProxy"));
        Assert.assertNotNull(PrintStreamStorage.getInstance().getPrintStreamStorage().get("Call findPerson PersonServiceImpl"));
        Assert.assertNotNull(PrintStreamStorage.getInstance().getPrintStreamStorage().get("After findPerson. PersonServiceProxy"));
        Assert.assertTrue(PrintStreamStorage.getInstance().getPrintStreamStorage().get("Before findPerson. PersonServiceProxy")
                < PrintStreamStorage.getInstance().getPrintStreamStorage().get("Call findPerson PersonServiceImpl"));
        Assert.assertTrue(PrintStreamStorage.getInstance().getPrintStreamStorage().get("Call findPerson PersonServiceImpl")
                < PrintStreamStorage.getInstance().getPrintStreamStorage().get("After findPerson. PersonServiceProxy"));
    }
}
