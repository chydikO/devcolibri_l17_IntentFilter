package com.chudnovskiy.devcolibri_l17_intentfilter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Objects;

public class CurrentDateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_date);
        Objects.requireNonNull(getSupportActionBar()).hide();

        TextView textViewDate = findViewById(R.id.text_view_date);
        textViewDate.setText(Calendar.getInstance().getTime().toString());
    }
}