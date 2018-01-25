package com.example.mrod.chapter44;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text = findViewById(R.id.text1);
        Button button = findViewById(R.id.button1);
        final TextView text1 = findViewById(R.id.textresult);


        text.setText("The Angle of PI/7 is: ");

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                double conversion , piToAngle, angleInDegrees,result1;
                conversion=(Math.PI)/7;

                piToAngle=Math.sin(conversion);
                angleInDegrees=Math.toDegrees(piToAngle);

                //var result its equal to the angle.
                result1=Math.round(angleInDegrees);
                text1.setText(String.valueOf(Math.round(result1)));



            }
        });

    }
}
