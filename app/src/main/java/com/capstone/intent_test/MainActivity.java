package com.capstone.intent_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by JB. Ahn 2017.11.12
 */

public class MainActivity extends AppCompatActivity {

    EditText input_text;
    Button intent_btn;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_text = (EditText) findViewById(R.id.inputText);
        intent_btn = (Button) findViewById(R.id.intent_btn);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroupLang);

        intent_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent myIntent = new Intent(MainActivity.this, IntentActivity.class);
                Intent myIntent = new Intent(MainActivity.this, FoodInfoActivity_v1.class);

                int selected_radioBtn = radioGroup.getCheckedRadioButtonId();
                RadioButton radioBtn = (RadioButton) findViewById(selected_radioBtn);
                String selectedLang = radioBtn.getText().toString();

                myIntent.putExtra("inputText", String.valueOf(input_text.getText()));
                myIntent.putExtra("selectedLang", selectedLang);
                startActivity(myIntent);
            }
        });
    }
}
