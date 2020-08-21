package com.example.metertoinches;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Entermeters;
    private Button ConvertButton;
    private TextView resultTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Entermeters = (EditText) findViewById(R.id.metersid);
        resultTextview = (TextView) findViewById(R.id.ResultId);
        ConvertButton = (Button) findViewById(R.id.ConvertButtonid);

        // Conversion logic

        ConvertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /* 1 meter = 39.370in*/

                double multiplier = 39.37;
                double result = 0.0;

                if (Entermeters.getText().toString().equals("")){

                    Entermeters.setText(R.string.error_message);
                    Entermeters.setTextColor(Color.RED);

                }else{

                    double Metersvalue =  Double.parseDouble(Entermeters.getText().toString());

                    result = Metersvalue*multiplier;

                    resultTextview.setTextColor(Color.DKGRAY);
                    resultTextview.setText(String.format("%.2f",result)+" inches");

                }

            }
        });
    }
}