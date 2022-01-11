package com.example.fragments_590;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.fragments_590.Fragments_590_folder.FirstFragment_Home;
import com.example.fragments_590.Fragments_590_folder.FragmentSecond_Videos;

public class MainActivity extends AppCompatActivity {
Button btn1, btn2;
LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.button5);
        btn2=findViewById(R.id.button3);
        linearLayout=findViewById(R.id.linear);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirstFragment_Home firstFragment_home=new FirstFragment_Home();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linear, firstFragment_home);
                transaction.commit();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentSecond_Videos fragmentSecond_videos =new FragmentSecond_Videos();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linear, fragmentSecond_videos);
                transaction.commit();
            }
        });
    }
}