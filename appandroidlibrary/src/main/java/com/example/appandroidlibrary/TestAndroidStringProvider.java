package com.example.appandroidlibrary;

import com.google.auto.factory.AutoFactory;

@AutoFactory
public class TestAndroidStringProvider {

    private String androidLibraryString;

    public TestAndroidStringProvider(String androidLibraryString) {
        this.androidLibraryString = androidLibraryString;
    }

    public String getTestString() {
        return androidLibraryString;
    }
}
