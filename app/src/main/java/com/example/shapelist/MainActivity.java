package com.example.shapelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.sax.StartElementListener;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.security.acl.Group;
import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ListView lvContact;
    private CustomAdapter adapter=null ;
    public static ArrayList<Contact> list = new ArrayList<Contact>();
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Button btn1 = findViewById(R.id.button);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.setBackgroundColor(Color.parseColor("#F1B000"));
                btn2.setBackgroundColor(Color.parseColor("#C4C4C4"));
                btn3.setBackgroundColor(Color.parseColor("#C4C4C4"));

                ArrayList<Contact> listFilter1 = new ArrayList<>();
                for(Contact contact : list){
                    if(contact.getName().contains("Donut")){
                        listFilter1.add(contact);
                    }
                }
                adapter  = new CustomAdapter(MainActivity.this, R.layout.item_contact, listFilter1);
                lvContact.setAdapter(adapter);


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn2.setBackgroundColor(Color.parseColor("#F1B000"));
                btn1.setBackgroundColor(Color.parseColor("#C4C4C4"));
                btn3.setBackgroundColor(Color.parseColor("#C4C4C4"));

                ArrayList<Contact> listFilter2 = new ArrayList<>();
                for(Contact contact : list){
                    if(contact.getName().contains("Pink")){
                        listFilter2.add(contact);
                    }
                }
                adapter  = new CustomAdapter(MainActivity.this, R.layout.item_contact, listFilter2);
                lvContact.setAdapter(adapter);


            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn3.setBackgroundColor(Color.parseColor("#F1B000"));
                btn2.setBackgroundColor(Color.parseColor("#C4C4C4"));
                btn1.setBackgroundColor(Color.parseColor("#C4C4C4"));

                ArrayList<Contact> listFilter3 = new ArrayList<>();
                for(Contact contact : list){
                    if(contact.getName().contains("Floating")){
                        listFilter3.add(contact);
                    }
                }
                adapter  = new CustomAdapter(MainActivity.this, R.layout.item_contact, listFilter3);
                lvContact.setAdapter(adapter);


            }
        });






        lvContact =(ListView) findViewById(R.id.lv_context);
        editText = (EditText) findViewById(R.id.edsearch);
        list = new ArrayList<Contact>();
        list.add(new Contact("Tasty Donut","$10.00",R.drawable.donut_yellow_1));
        list.add(new Contact("Pink Donut","$20.00",R.drawable.tasty_donut_1));
        list.add(new Contact("Floating Donut","$30.00",R.drawable.green_donut_1));
        list.add(new Contact("Tasty Donut","$40.00",R.drawable.donut_red_1));

        adapter  = new CustomAdapter(this, R.layout.item_contact, list);
        lvContact.setAdapter(adapter);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                ArrayList<Contact> listFilter = new ArrayList<>();
                for(Contact contact : list){
                    if(contact.getName().contains(charSequence.toString())){
                        listFilter.add(contact);
                    }
                }
                adapter  = new CustomAdapter(MainActivity.this, R.layout.item_contact, listFilter);
                lvContact.setAdapter(adapter);

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener(){


            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position==0){
                    Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",R.drawable.donut_yellow_1);
                    intent.putExtras(bundle);
                    intent.putExtra("title","Tasty Donut");
                    intent.putExtra("dip","$10.00");
                    startActivity(intent);
                }
                if (position==1){
                    Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",R.drawable.tasty_donut_1);
                    intent.putExtras(bundle);
                    intent.putExtra("title","Pink Donut");
                    intent.putExtra("dip","$20.00");
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",R.drawable.green_donut_1);
                    intent.putExtras(bundle);
                    intent.putExtra("title","Floating Donut");
                    intent.putExtra("dip","$30.00");
                    startActivity(intent);
                }
                if (position==3){
                    Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",R.drawable.donut_red_1);
                    intent.putExtras(bundle);
                    intent.putExtra("title","Tasty Donut");
                    intent.putExtra("dip","$40.00");
                    startActivity(intent);
                }
            }
        });



    }


    @Override
    public void onClick(View view) {

    }

}