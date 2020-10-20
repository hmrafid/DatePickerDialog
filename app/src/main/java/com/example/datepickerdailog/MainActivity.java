package com.example.datepickerdailog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.time.Clock;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private AnalogClock analogClock;
    private View clock;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        analogClock=findViewById(R.id.analogClockId);
        clock=findViewById(R.id.textClockId);
        analogClock.setOnClickListener(this::onClick);
        clock.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.analogClockId){
            Toast.makeText(this,"Anal clock",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,"digit clock",Toast.LENGTH_SHORT).show();
        }
    }
}