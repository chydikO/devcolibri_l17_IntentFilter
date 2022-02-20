package com.chudnovskiy.devcolibri_l17_intentfilter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Objects;

public class SiteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site);
        Objects.requireNonNull(getSupportActionBar()).hide();

        //TODO: WebView добавить на экран и сделать полноценный серфинг

    }
}