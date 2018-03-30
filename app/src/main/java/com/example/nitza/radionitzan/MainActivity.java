package com.example.nitza.radionitzan;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableLayout;

import static android.graphics.Color.GREEN;
import static android.graphics.Color.WHITE;

public class MainActivity extends AppCompatActivity {
RadioButton r1,r2,r3;
Button b1,b2;
RadioGroup rg;
LinearLayout Ln;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1=(RadioButton)findViewById(R.id.r1);
        r2=(RadioButton)findViewById(R.id.r2);
        r3=(RadioButton)findViewById(R.id.r3);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        rg=(RadioGroup)findViewById(R.id.rg);
        Ln=(LinearLayout) findViewById(R.id.Ln);

    }

    public void change(View view) {
        if (r1.isChecked()){
            Ln.setBackgroundColor(GREEN);}
            else if (r1.isChecked()){
            Ln.setBackgroundColor(Color.BLUE);}
            else if (r1.isChecked()){
            Ln.setBackgroundColor(Color.RED);}


    }

    public void reset(View view) {
        rg.clearCheck();
        Ln.setBackgroundColor(WHITE);

    }
}
