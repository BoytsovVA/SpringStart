package com.SpringStart.Controller.services;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "request", proxyMode = ScopedProxyMode.INTERFACES)
public class TestRequestBean implements ITestRequestBean {
    int counter;

    public TestRequestBean() {
        counter = 0;
    }

    @Override
    public int getCounter() {
        return counter;
    }

    @Override
    public void setCounter(int counter) {
        this.counter = counter;
    }
}
