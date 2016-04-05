package com.example.nitin.assignment4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class TAInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tainfo);

        TextView website = (TextView) findViewById(R.id.TaWeb1);
        /*Adding a hyperlink to the website url*/
        website.setText(Html.fromHtml("<a href=http://neptune.usc.edu/~pradipta/> http://neptune.usc.edu/~pradipta/"));
        website.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
