package com.example.datepickerdailog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TimePicker timePicker;
    private Button button;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.buttonId);
        textView=findViewById(R.id.textViewId);
        timePicker=findViewById(R.id.timePickerId);
        timePicker.setIs24HourView(true);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String time= timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute();
                textView.setText(time);
            }
        });
    }

}