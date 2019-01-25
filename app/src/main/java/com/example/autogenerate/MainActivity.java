package com.example.autogenerate;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.appandroidlibrary.TestAndroidStringProvider;
import com.example.appandroidlibrary.TestAndroidStringProviderFactory;
import com.example.applibrary.TestStringProvider;
import com.example.applibrary.TestStringProviderFactory;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestStringProviderFactory factory = new TestStringProviderFactory();
        TestStringProvider javaStringProvider = factory.create("This is from a java library");
        String javaLibraryString = javaStringProvider.getTestString();

        TestAndroidStringProviderFactory androidLibraryFactory = new TestAndroidStringProviderFactory();
        TestAndroidStringProvider androidStringProvider = androidLibraryFactory.create("This is from an android library");
        String androidLibraryString = androidStringProvider.getTestString();


        TextView testTextView = findViewById(R.id.test);
        testTextView.setText(javaLibraryString + "\n" + androidLibraryString);

    }
}
