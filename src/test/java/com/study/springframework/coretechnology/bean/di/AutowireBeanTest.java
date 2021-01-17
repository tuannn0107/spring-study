package com.study.springframework.coretechnology.bean.di;

import com.study.springframework.AbstractSpringFrameworkStudyTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

public class AutowireBeanTest extends AbstractSpringFrameworkStudyTest {
    @Test
    public void autowireCollectionTest() {
        ApplicationContext applicationContext = getApplicationContext();
        AutowireCollection autowireCollection = applicationContext.getBean(AutowireCollection.class);

        Assert.assertNotNull(autowireCollection.getBeanAArr());
        Assert.assertTrue(autowireCollection.getBeanAArr().length == 1);
        Assert.assertNotNull(autowireCollection.getBeanBList());
        Assert.assertTrue(autowireCollection.getBeanBList().size() == 1);
    }
}
