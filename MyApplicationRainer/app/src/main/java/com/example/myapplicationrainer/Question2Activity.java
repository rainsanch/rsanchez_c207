package com.example.myapplicationrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Question2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        Toast.makeText(this, "Quiz has Started", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, QuestionActivity3.class);
        intent.putExtra("name", "Rainer");
        startActivity(intent);
    }
}