package com.example.myapplicationrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class QuestionActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        Toast.makeText(this, "Quiz has Started", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, QuestionActivity5.class);
        intent.putExtra("name", "Rainer");
        startActivity(intent);
    }
}