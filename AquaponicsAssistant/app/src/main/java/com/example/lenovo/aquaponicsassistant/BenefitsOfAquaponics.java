package com.example.lenovo.aquaponicsassistant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BenefitsOfAquaponics extends AppCompatActivity {
    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benefits_of_aquaponics);
        textView3=(TextView)findViewById(R.id.textView3);
    }
}
