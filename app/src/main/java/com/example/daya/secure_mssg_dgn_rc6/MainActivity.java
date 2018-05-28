package com.example.daya.secure_mssg_dgn_rc6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button write,inbox,about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        write = (Button)findViewById(R.id.btnwrite);
        inbox = (Button)findViewById(R.id.btninbox);
        about = (Button)findViewById(R.id.btnAbout);

        write.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(MainActivity.this, write_messege.class);
                startActivity(i);
            }
        });

        write.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in  =new Intent(MainActivity.this, inbox_messege.class);
                startActivity(in);
            }
        });
        write.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte  =new Intent(MainActivity.this, about.class);
                startActivity(inte);
            }
        });
    }
}
