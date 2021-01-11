package com.study.springframework.coretechnology.bean.scope;

import com.study.springframework.coretechnology.bean.IBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BeanPrototype implements IBean {
    @Override
    public void sayHi() {
        System.out.println("Hello " + this.getClass().toString());
    }
}
