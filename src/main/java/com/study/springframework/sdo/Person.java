package com.study.springframework.sdo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String name;
    private Date birthDate = new Date();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
