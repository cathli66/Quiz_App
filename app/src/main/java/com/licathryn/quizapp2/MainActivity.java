package com.licathryn.quizapp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button submitButton;
    Button colorButton;
    EditText responseText;
    EditText colorText;
    TextView displayText;
    ConstraintLayout YourView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        responseText=findViewById(R.id.responseEditText);
        displayText=findViewById(R.id.textBox);
        submitButton=findViewById(R.id.clickButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Hello mom");
                Log.i("testButton", "Hi dad! "+responseText.getText().toString());
                displayText.setText(displayText.getText().toString() + " Your name is " + responseText.getText().toString());
            }
        });
        YourView = (ConstraintLayout) findViewById(R.id.layout);
        colorText=findViewById(R.id.response2EditText);
        colorButton=findViewById(R.id.clickButton2);
        colorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // YourView.setBackgroundColor(Color.argb(255, 255, 0, 0));
                YourView.setBackgroundColor(Color.parseColor(colorText.getText().toString()));
            }
        });
        responseText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus) {
                    if(responseText.getText().toString().equals("TJ")) {
                        displayText.setText("TJ Rocks!");
                        responseText.setText("");
                        responseText.setHint("That's a good name.");
                    }
                }
            }
        });
    }
}
