package com.example.lenovo.aquaponicsassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toolbar;

public class OptionsActivity extends AppCompatActivity {

    //Toolbar toolbar;
    ListView listView;
    //String value= getIntent().getStringExtra("Email");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        //toolbar = findViewById(R.id.toolbar);



        listView =  findViewById(R.id.listview);

        ArrayAdapter<String>mAdapter=new ArrayAdapter<String>(OptionsActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Options));
       listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                //String value = listView.getItemAtPosition(i).toString();
                if (position==0) {
                    //Intent intent1 = new Intent(OptionsActivity.this, WhatIsAquaponicsActivity.class);
                   // intent1.putExtra("Options",listView.getItemAtPosition(i).toString());
                   // startActivity(intent1);
                    Intent intent1=new Intent(view.getContext(),WhatIsAquaponicsActivity.class);
                    startActivityForResult(intent1,0);

                }
                if (position==1) {
                    //Intent intent2 = new Intent(OptionsActivity.this, BenefitsOfAquaponics.class);
                   // intent2.putExtra("Options",listView.getItemAtPosition(i).toString());
                    //startActivity(intent2);
                    Intent intent1=new Intent(view.getContext(),BenefitsOfAquaponics.class);
                    startActivityForResult(intent1,1);
                }
                if (position==2) {
                    //Intent intent3 = new Intent(OptionsActivity.this, RequirementsActivity.class);
                   // intent3.putExtra("Options",listView.getItemAtPosition(i).toString());
                    //startActivity(intent3);
                    Intent intent1=new Intent(view.getContext(),RequirementsActivity.class);
                    startActivityForResult(intent1,2);
                }
                if (position==3) {
                    //Intent intent4 = new Intent(OptionsActivity.this, OnlineResourcesActivity.class);
                    //intent4.putExtra("Options",listView.getItemAtPosition(i).toString());
                    //startActivity(intent4);
                    Intent intent1=new Intent(view.getContext(),OnlineResourcesActivity.class);
                    startActivityForResult(intent1,3);
                }
                if (position==4) {
                    //Intent intent5 = new Intent(OptionsActivity.this, CommunityActivity.class);
                    //intent5.putExtra("Options",listView.getItemAtPosition(i).toString());
                    //startActivity(intent5);
                    Intent intent1=new Intent(view.getContext(),ChatActivity.class);
                    startActivityForResult(intent1,4);
                   // getIntent().putExtra("Email",value);
                }
                if (position==5) {
                    //Intent intent6 = new Intent(OptionsActivity.this, FAQActivity.class);
                    //intent6.putExtra("Options",listView.getItemAtPosition(i).toString());
                    //startActivity(intent6);
                    Intent intent1=new Intent(view.getContext(),FAQActivity.class);
                    startActivityForResult(intent1,5);
                }
                if (position==6) {
                    //Intent intent7 = new Intent(OptionsActivity.this, SeedTrackerActivity.class);
                    //intent7.putExtra("Options",listView.getItemAtPosition(i).toString());
                    //startActivity(intent7);
                    Intent intent1=new Intent(view.getContext(),SeedTrackerActivity.class);
                    startActivityForResult(intent1,6);
                }
                if (position==7) {
                    //Intent intent7 = new Intent(OptionsActivity.this, SeedTrackerActivity.class);
                    //intent7.putExtra("Options",listView.getItemAtPosition(i).toString());
                    //startActivity(intent7);
                    Intent intent1=new Intent(view.getContext(),ProfileActivity.class);
                    startActivityForResult(intent1,7);
                }
            }
        });
        listView.setAdapter(mAdapter);
    }
}
