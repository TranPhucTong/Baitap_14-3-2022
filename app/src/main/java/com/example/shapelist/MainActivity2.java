package com.example.shapelist;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private String curent;
    ImageView imageView;
    TextView textView1, textView;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();

        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        imageView =findViewById(R.id.imageView1);
        textView = findViewById(R.id.textView2);
        textView1 = findViewById(R.id.textView5);

        if(position==0){
            Intent intent =getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic  = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDip = intent.getStringExtra("dip");
            imageView.setImageResource(pic);
            textView.setText(aTitle);
            textView1.setText(aDip);
        }
        if(position==1){
            Intent intent =getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic  = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDip = intent.getStringExtra("dip");


            imageView.setImageResource(pic);
            textView.setText(aTitle);
            textView1.setText(aDip);
        }
        if(position==2){
            Intent intent =getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic  = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDip = intent.getStringExtra("dip");

            imageView.setImageResource(pic);
            textView.setText(aTitle);
            textView1.setText(aDip);
        }
        if(position==3){
            Intent intent =getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic  = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDip = intent.getStringExtra("dip");

            imageView.setImageResource(pic);
            textView.setText(aTitle);
            textView1.setText(aDip);
        }
    }
}