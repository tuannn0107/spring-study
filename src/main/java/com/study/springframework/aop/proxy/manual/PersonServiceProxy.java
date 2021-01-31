package com.study.springframework.aop.proxy.manual;

import com.study.springframework.aop.proxy.IPersonService;
import com.study.springframework.utils.PrintStreamStorage;

public class PersonServiceProxy implements IPersonService {
    private final IPersonService personService;

    public PersonServiceProxy(IPersonService personService) {
        this.personService = personService;
    }

    @Override
    public void sayHello() {
        PrintStreamStorage.getInstance().println("Before sayHello. " + this.getClass().getSimpleName());
        personService.sayHello();
        PrintStreamStorage.getInstance().println("After sayHello. "  + this.getClass().getSimpleName());
    }

    @Override
    public void findPerson() {
        PrintStreamStorage.getInstance().println("Before findPerson. "  + this.getClass().getSimpleName());
        personService.findPerson();
        PrintStreamStorage.getInstance().println("After findPerson. "  + this.getClass().getSimpleName());
    }
}
