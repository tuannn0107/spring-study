package com.study.springframework.aop.service;

import com.study.springframework.utils.PrintStreamStorage;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements IService {
    @Override
    public void insert() {
        PrintStreamStorage.getInstance().println("Call Insert.");
    }

    @Override
    public void insertNew(String str) {
        PrintStreamStorage.getInstance().println("Call insertNew(String str).");
    }

    @Override
    public void update() {
        PrintStreamStorage.getInstance().println("Call update.");
    }

    @Override
    public void read() {
        PrintStreamStorage.getInstance().println("Call read.");
    }
}
