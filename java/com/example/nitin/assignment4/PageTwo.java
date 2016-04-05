package com.example.nitin.assignment4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PageTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_two);

        /*Listening to all the button and act accordingly when the user clicks a button*/
        Button iInfo = (Button) findViewById(R.id.InstructorButton);
        Button aInfo = (Button) findViewById(R.id.TaButton);
        Button tInfo = (Button) findViewById(R.id.TeamButton);

        iInfo.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v1) {
                        startActivity(new Intent(PageTwo.this, InstructorInfo.class));
                    }
                }
        );

        aInfo.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v2) {
                        startActivity(new Intent(PageTwo.this, TAInfo.class));
                    }
                }
        );

        tInfo.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v3) {
                        startActivity(new Intent(PageTwo.this, TeamInfo.class));
                    }
                }
        );
    }
}
