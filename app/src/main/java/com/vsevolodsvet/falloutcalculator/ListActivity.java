package com.vsevolodsvet.falloutcalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;

import com.vsevolodsvet.falloutcalculator.Listeners.ButtonListeners;

/**
 * @author VsevolodSvet
 * date: 23.09.2018
 */

public class ListActivity extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);
        ImageButton showButton = findViewById(R.id.show);
        ImageButton exitButton = findViewById(R.id.exit);
        showButton.setOnTouchListener(ButtonListeners.getOnTouchListener(showButton));
        exitButton.setOnTouchListener(ButtonListeners.getOnTouchListener(exitButton));
    }

    @Override
    protected void onStart() {
        super.onStart();

    }
}