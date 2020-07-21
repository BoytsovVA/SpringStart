package com.SpringStart.Controller.services;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "session", proxyMode = ScopedProxyMode.INTERFACES)
public class TestSessionBean implements ITestSessionBean {
    int counter;

    public TestSessionBean() {
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
