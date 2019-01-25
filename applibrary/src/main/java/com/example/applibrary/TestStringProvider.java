package com.example.applibrary;

import com.google.auto.factory.AutoFactory;

@AutoFactory
public class TestStringProvider {

    private String testString;

    public TestStringProvider(String testString) {
        this.testString = testString;
    }

    public String getTestString() {
        return testString;
    }
}
