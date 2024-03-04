package com.example.myapplicationrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        Toast.makeText(this, "Quiz has Started", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Question2Activity.class);
        intent.putExtra("name", "Rainer");
        startActivity(intent);

    }
}