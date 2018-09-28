package com.vsevolodsvet.falloutcalculator.Listeners;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

/**
 * @author VsevolodSvet
 * date: 24.09.2018
 */

public class ButtonListeners {

    public static View.OnTouchListener getOnTouchListener(final ImageButton button, final int touched, final int untouched){
        return new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                setButtonTouch(motionEvent, button, touched, untouched);
                return false;
            }
        };
    }

    private static void setButtonTouch (MotionEvent motionEvent, ImageButton currentButton, int touched, int untouched){
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
