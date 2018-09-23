package com.vsevolodsvet.falloutcalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

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
        showButton.setOnTouchListener(onTouchListener);
        exitButton.setOnTouchListener(onTouchListener);
    }

    public View.OnTouchListener onTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int currentId = view.getId();
            ImageButton currentButton = findViewById(currentId);
            switch (currentId) {
                default:
                    int currentMotion = motionEvent.getAction();
                    switch (currentMotion) {
                        case MotionEvent.ACTION_DOWN:
                            currentButton.setImageResource(R.drawable.common_button_pressed);
                            break;
                        case MotionEvent.ACTION_MOVE:
                            currentButton.setImageResource(R.drawable.common_button_pressed);
                            break;
                        case MotionEvent.ACTION_UP:
                        case MotionEvent.ACTION_CANCEL:
                            currentButton.setImageResource(R.drawable.common_button);
                            break;
                    }
                    break;
            }
            return false;
        }
    };
}