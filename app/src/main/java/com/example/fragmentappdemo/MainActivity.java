package com.example.fragmentappdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.fragmentappdemo.databinding.ActivityMainBinding;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
TextView textViewAreaResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewAreaResult = findViewById(R.id.textViewAreaResult);
    }
    void setAreaResult(String result)
    {

       textViewAreaResult.setText(result);
    }
}