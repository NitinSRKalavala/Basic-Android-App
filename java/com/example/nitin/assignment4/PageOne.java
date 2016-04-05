package com.example.nitin.assignment4;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class PageOne extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_one);

        /*To validate the user input*/
        Button submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView username = (TextView) findViewById(R.id.username);

                        String userInput = username.getText().toString();

                        /*If the user enter the correct username then the activity is changed to pagetwo else it remains
                            in the same page giving an error saying invalid username*/
                        if (userInput.contentEquals("EE579_G7") || userInput.contentEquals("TA")) {
                            startActivity(new Intent(PageOne.this, PageTwo.class));
                        } else {
                            username.setText("");
                            username.setHint("Invalid Username");
                            username.setHintTextColor(Color.parseColor("#ffcc00"));
                        }
                    }
                }
        );

        /*To close the keypad after the user click done on it while checking the username entered*/
        EditText doneKey = (EditText) findViewById(R.id.username);

        doneKey.setOnEditorActionListener(
                new TextView.OnEditorActionListener() {
                    @Override
                    public boolean onEditorAction(TextView v, int i, KeyEvent event) {
                        boolean handled = false;

                        if (i == EditorInfo.IME_ACTION_DONE) {
                            TextView username = (TextView) findViewById(R.id.username);

                            String userInput = username.getText().toString();

                            if (userInput.contentEquals("EE579_G7") || userInput.contentEquals("TA")) {
                                startActivity(new Intent(PageOne.this, PageTwo.class));
                            }else {
                                username.setText("");
                                username.setHint("Invalid Username");
                                username.setHintTextColor(Color.parseColor("#ffcc00"));
                            }
                            handled = true;
                        }
                        return handled;
                    }
                }
        );
    }
}

