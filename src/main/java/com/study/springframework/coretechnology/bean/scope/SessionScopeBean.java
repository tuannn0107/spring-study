package com.study.springframework.coretechnology.bean.scope;

import com.study.springframework.coretechnology.bean.IBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Scope(value = "session")
public class SessionScopeBean implements IBean {
    @Override
    public void sayHi() {
        System.out.println("Hello SessionScopeBean!!!!");
    }
}
