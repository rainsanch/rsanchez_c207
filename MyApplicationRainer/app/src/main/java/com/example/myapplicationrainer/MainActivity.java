package com.example.myapplicationrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.myapplicationrainer.Question1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start = findViewById(R.id.StartBtn);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Quiz has Started", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Question1.class);
                intent.putExtra("name", "Rainer");
                startActivity(intent);

            }
        });
    }
}