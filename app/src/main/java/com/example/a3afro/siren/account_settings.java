package com.example.a3afro.siren;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class account_settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_settings);
        TextView change_picture = (TextView) findViewById(R.id.change_picture);
        change_picture.setPaintFlags(change_picture.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }
}
