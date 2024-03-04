package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void clicker(View v) {
        Intent i = new Intent(this, MainActivity3.class);
        Toast.makeText(this, "Question 2 started", Toast.LENGTH_SHORT).show();
        i.putExtra("Score", "Score");
        startActivity(i);

        submitQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedRadioButttonId = answerQ1.getCheckedRadioButtonId();
                if(selectedRadioButttonId != -1){
                    RadioButton selectedRB = findViewById(selectedRadioButttonId);
                    if(Integer.parseInt(selectedRB.getText().toString()) ==2008){
                        Toast.makeText(Question1.this, "Youve got the correct answer", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Question1.this, MainActivity.class);
                        intent.putExtra("name", "Aldwin"); //Pass data to other intent
                        startActivity(intent);
                    }else{
                        Toast.makeText(Question1.this, "Wrong answer", Toast.LENGTH_SHORT).show();
                    }
                    Toast.makeText(Question1.this, "Selected: " + selectedRB.getText(), Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(Question1.this, "No option selected", Toast.LENGTH_SHORT).show();

    }
}