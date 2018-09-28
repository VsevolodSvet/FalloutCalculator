package com.vsevolodsvet.falloutcalculator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.vsevolodsvet.falloutcalculator.Listeners.ButtonListeners;

/**
 * @author VsevolodSvet
 * date: 24.09.2018
 */

@SuppressLint("Registered")
public class LoginActivity extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        ImageButton enterButton = findViewById(R.id.enter);
        ImageButton registerButton = findViewById(R.id.register);
        enterButton.setOnTouchListener(ButtonListeners.getOnTouchListener(enterButton, R.drawable.login_button_pressed, R.drawable.login_button));
        registerButton.setOnTouchListener(ButtonListeners.getOnTouchListener(registerButton, R.drawable.login_button_pressed, R.drawable.login_button));

        EditText edit;

        edit = (EditText)findViewById(R.id.login_enter);
        edit.setText("");
        edit = (EditText)findViewById(R.id.password_enter);
        edit.setText("");
    }



    public void onLogin(View v){
        boolean isValid = true;
        boolean serverOk = true;
    }

    public void onLogin(Object object){
        Log.i(this.getClass().getSimpleName(), object.toString());
        startActivity(new Intent(this, ListActivity.class));
        finish();
    }
}
