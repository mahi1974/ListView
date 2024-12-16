package com.example.listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv=findViewById(R.id.listview);

        String []ar={"Mahipat","Ronik","Dhaval","Paras","Hari"};

        ArrayAdapter<String> ad=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,ar);
        lv.setAdapter(ad);
     }
}