package com.example.tara.learn;

import android.content.Intent;
import android.support.v4.text.BidiFormatter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        //Get intent that started this activity and extract string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        /*String suggestion = "15 Bay Street, Laurel, CA";
        BidiFormatter myBidiFormatter = BidiFormatter.getInstance();
        String.format(R.string.did_you_mean, myBidiFormatter.unicodeWrap(suggestion));
*/
        //Capture the layout's Textview and set the string as its text
        TextView textView = (TextView) findViewById(R.id.textView3);
        //getResource looks into the res folder and get string
        // get a string type from R (this project) .string the
        // string xml and the name of the string to get
        textView.setText(message+" "+getResources().getString(R.string.button_send));
    }

}
