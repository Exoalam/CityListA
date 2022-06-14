package com.example.citylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView textView=(TextView) findViewById(R.id.text_back);
        Button button=findViewById(R.id.button_back);

        Bundle bundle = getIntent().getExtras();
        if(!bundle.isEmpty())
        {
            String s = bundle.getString("cityname");
            textView.setText(s);
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent intent1= new Intent(ShowActivity.this,MainActivity.class);
                 startActivity(intent1);
                 finish();
            }
        });

    }
}