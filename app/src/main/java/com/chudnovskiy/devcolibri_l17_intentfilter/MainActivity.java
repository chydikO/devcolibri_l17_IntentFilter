package com.chudnovskiy.devcolibri_l17_intentfilter;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private Button buttonExplicit;
    private Button buttonImplicit;
    private Button buttonOpenContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();

        buttonImplicit = findViewById(R.id.button_implicit);
        buttonExplicit = findViewById(R.id.button_explicit);
        buttonOpenContacts = findViewById(R.id.button_contacts);

        buttonImplicit.setOnClickListener(view -> {
            Intent intent = new Intent("site_activity");
            startActivity(intent);
        });

        buttonExplicit.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), CurrentDateActivity.class);
            startActivity(intent);
        });

        buttonOpenContacts.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setComponent(
                    new ComponentName(
                            "com.android.contacts",
                            "com.android.contacts.DialtactsContactsEntryActivity")
            );
            startActivity(intent);
        });
    }
}