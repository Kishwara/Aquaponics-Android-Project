package com.example.lenovo.aquaponicsassistant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GettingStartedActivity1 extends AppCompatActivity {
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getting_started1);
        textView2=(TextView)findViewById(R.id.textView2);
    }
}
