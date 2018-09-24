package com.vsevolodsvet.falloutcalculator.Listeners;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

import com.vsevolodsvet.falloutcalculator.R;

/**
 * @author VsevolodSvet
 * date: 24.09.2018
 */

public class ButtonListeners {

    public static View.OnTouchListener getOnTouchListener(final ImageButton button){
        return new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int currentId = view.getId();
                switch (currentId) {
                    case R.id.enter:
                    case R.id.register:
                        setButtonTouch(motionEvent, button, R.drawable.login_button_pressed, R.drawable.login_button);
                        break;
                    case R.id.exit:
                        setButtonTouch(motionEvent, button, R.drawable.common_button_pressed, R.drawable.common_button);
                        break;
                    default:
                        setButtonTouch(motionEvent, button, R.drawable.common_button_pressed, R.drawable.common_button);
                        break;
                }
                return false;
            }
        };
    }

    public static void setButtonTouch (MotionEvent motionEvent, ImageButton currentButton, int touched, int untouched){
        int currentMotion = motionEvent.getAction();
        switch (currentMotion) {
            case MotionEvent.ACTION_DOWN:
                currentButton.setImageResource(touched);
                break;
            case MotionEvent.ACTION_MOVE:
                currentButton.setImageResource(touched);
                break;
            case MotionEvent.ACTION_UP:
            case MotionEvent.ACTION_CANCEL:
                currentButton.setImageResource(untouched);
                break;
        }
    }
}
