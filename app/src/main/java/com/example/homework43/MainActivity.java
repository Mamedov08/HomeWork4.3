package com.example.homework43;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.namespace.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new ContinentsFragment()).commit();
    }
}