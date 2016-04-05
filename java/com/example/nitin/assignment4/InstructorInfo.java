package com.example.nitin.assignment4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class InstructorInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructor_info);

        TextView website = (TextView) findViewById(R.id.InstWeb1);
        /*Adding a hyperlink to the website url*/
        website.setText(Html.fromHtml("<a href=http://ceng.usc.edu/~bkrishna/> http://ceng.usc.edu/~bkrishna/"));
        website.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
