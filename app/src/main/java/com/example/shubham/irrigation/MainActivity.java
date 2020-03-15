package com.example.shubham.irrigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button a=(Button)findViewById(R.id.automatic);
        Button b=(Button)findViewById((R.id.manual));
        final TextView c=(TextView)findViewById(R.id.irrigation);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c.setText("You are in automatic mode");
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c.setText("You are in manual mode");
            }
        });
    }
}
