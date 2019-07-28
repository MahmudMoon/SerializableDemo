package com.example.moon.serializabledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("student",new Student(1,"moon","mooncseru14@gmail.com"));
        intent.putExtra("bundle_key",bundle);
        startActivity(intent);

    }
}
