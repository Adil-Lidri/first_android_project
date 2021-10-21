package com.example.tp_sayhi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button heyButton = findViewById(R.id.buttonSayHi);
        TextView textViewDisplay = findViewById(R.id.textViewDisplay);
        EditText editTextName = findViewById(R.id.editTextName);

        heyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText() + "";
                textViewDisplay.setText("Hello " + name);
            }
        });
    }
}