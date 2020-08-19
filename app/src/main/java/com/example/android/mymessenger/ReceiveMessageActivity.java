package com.example.android.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {
    public static final String EXTRA_MASSAGE = "massage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent intent = getIntent();
        String massageText = intent.getStringExtra(EXTRA_MASSAGE);
        TextView massageViev = findViewById(R.id.massage);
        massageViev.setText(massageText);
    }
}
