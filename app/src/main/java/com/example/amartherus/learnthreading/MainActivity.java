package com.example.amartherus.learnthreading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    String filename;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createButtonClicked(View v) {

        File file = new File(context.getFilesDir(), filename);
    }

    public void loadButtonClicked(View v) {

    }

    public void clearButtonClicked(View v) {

    }
}
