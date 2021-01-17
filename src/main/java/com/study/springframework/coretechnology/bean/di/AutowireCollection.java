package com.study.springframework.coretechnology.bean.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AutowireCollection {
    @Autowired
    private BeanA[] beanAArr;
    private List<BeanB> beanBList;

    public AutowireCollection(List<BeanB> beanBList) {
        this.beanBList = beanBList;
    }

    public BeanA[] getBeanAArr() {
        return beanAArr;
    }

    public List<BeanB> getBeanBList() {
        return beanBList;
    }
}
