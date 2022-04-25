package com.study.springframework.aop.pointcut;

import com.study.springframework.AbstractSpringFrameworkStudyTest;
import com.study.springframework.aop.service.IService;
import com.study.springframework.utils.PrintStreamStorage;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PointCutConfigTest extends AbstractSpringFrameworkStudyTest {
    @Autowired
    private IService iService;


    @Test
    public void transactionMockTest() {
        iService.insert();
        Assert.assertNotNull(PrintStreamStorage.getInstance().getPrintStreamStorage().get("Call Insert."));
        Assert.assertTrue(PrintStreamStorage.getInstance().getPrintStreamStorage().get("Execute before method insert") < PrintStreamStorage.getInstance().getPrintStreamStorage().get("Call Insert."));
        Assert.assertTrue(PrintStreamStorage.getInstance().getPrintStreamStorage().get("Execute after method insert") > PrintStreamStorage.getInstance().getPrintStreamStorage().get("Call Insert."));

        iService.insertNew("abc");
        Assert.assertNotNull(PrintStreamStorage.getInstance().getPrintStreamStorage().get("Call insertNew(String str)."));
        Assert.assertTrue(PrintStreamStorage.getInstance().getPrintStreamStorage().get("Execute before method insertNew xxx xxx xxx") < PrintStreamStorage.getInstance().getPrintStreamStorage().get("Call insertNew(String str)."));
        Assert.assertTrue(PrintStreamStorage.getInstance().getPrintStreamStorage().get("Execute after method insertNew") > PrintStreamStorage.getInstance().getPrintStreamStorage().get("Call insertNew(String str)."));
    }
}
