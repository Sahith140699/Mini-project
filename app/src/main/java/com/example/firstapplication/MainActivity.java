package com.example.firstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button fp = findViewById(R.id.button);

        fp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Going to FP", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), FirstPage.class);
                startActivity(intent);
            }
        });


    }
}
