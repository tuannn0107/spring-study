package com.study.springframework.aop.proxy;

import com.study.springframework.utils.PrintStreamStorage;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements IPersonService {
    @Override
    public void sayHello() {
        PrintStreamStorage.getInstance().println("Call sayHello " + this.getClass().getSimpleName());
    }

    @Override
    public void findPerson() {
        PrintStreamStorage.getInstance().println("Call findPerson " + this.getClass().getSimpleName());
    }
}
