package com.example.autogenerate;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.applibrary.TestStringProvider;
import com.example.applibrary.TestStringProviderFactory;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestStringProviderFactory factory = new TestStringProviderFactory();

        TestStringProvider provider = factory.create("hii!");

        TextView testTextView = findViewById(R.id.test);
        testTextView.setText(provider.getTestString());

    }
}
