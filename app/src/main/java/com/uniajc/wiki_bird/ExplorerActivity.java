package com.uniajc.wiki_bird;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class ExplorerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

    }

    public void onClick (View view){
        Intent intent  = new Intent(this, MainActivity.class);
        try {startActivity(intent);} catch (Exception e){
            System.out.println("Error -> "+e);
        }
    }

}
