package com.example.lenovo.aquaponicsassistant;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OnlineResourcesActivity extends AppCompatActivity {

    private Button button1,button2,button3,button4,button5,button6;
    private TextView textviewVideos,textviewWebsites;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_resources);

        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);

        textviewVideos=findViewById(R.id.textviewVideos);
        textviewWebsites=findViewById(R.id.textviewWebsites);
    }

    public void onclick1(View view) {
        String url1="https://www.youtube.com/watch?v=z1eAIirXRU0&t=9s";
        Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse(url1));
        startActivity(intent1);
    }

    public void onclick2(View view) {
        String url2="https://www.youtube.com/user/bnbob01";
        Intent intent2=new Intent(Intent.ACTION_VIEW, Uri.parse(url2));
        startActivity(intent2);
    }

    public void onclick3(View view) {
        String url3="https://www.youtube.com/watch?v=pPXoZ1dtpq8";
        Intent intent3=new Intent(Intent.ACTION_VIEW, Uri.parse(url3));
        startActivity(intent3);
    }

    public void onclick4(View view) {
        String url4="https://en.wikipedia.org/wiki/Aquaponics";
        Intent intent4=new Intent(Intent.ACTION_VIEW, Uri.parse(url4));
        startActivity(intent4);
    }

    public void onclick5(View view) {
        String url5="https://www.friendlyaquaponics.com/";
        Intent intent5=new Intent(Intent.ACTION_VIEW, Uri.parse(url5));
        startActivity(intent5);
    }

    public void onclick6(View view) {
        String url6="https://thefishsite.com/articles/a-beginners-guide-to-aquaponics";
        Intent intent6=new Intent(Intent.ACTION_VIEW, Uri.parse(url6));
        startActivity(intent6);
    }
}
