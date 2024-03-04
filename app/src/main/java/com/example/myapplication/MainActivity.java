package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void clicker(View v) {
        Intent i = new Intent(this, MainActivity2.class);
        Toast.makeText(this, "Question 1 started", Toast.LENGTH_SHORT).show();
        i.putExtra("Score", "Score");
        startActivity(i);
    }

}