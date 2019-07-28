package com.example.moon.serializabledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.Serializable;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("bundle_key");
        if(bundle!=null) {
            Serializable serializable = bundle.getSerializable("student");
            Student student = (Student)serializable;
            if(student!=null){
                Log.i(TAG, "onCreate: "+student.getEmail());
            }
        }
    }
}
