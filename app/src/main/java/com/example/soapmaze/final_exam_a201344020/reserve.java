package com.example.soapmaze.final_exam_a201344020;

import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TimePicker;

public class reserve extends AppCompatActivity {
    Switch start_switch;
    Chronometer reserve_chrono;
    RadioGroup rd_discount, rd_datetime;
    RadioButton rbtn_discount1, rbtn_discount2, rbtn_discount3, rbtn_date, rbtn_time;
    EditText adult, young, child;
    CalendarView d_pick;
    TimePicker t_pick;
    LinearLayout customer, datetimepick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve);
        start_switch = (Switch)findViewById(R.id.reserve_switch);
        reserve_chrono = (Chronometer)findViewById(R.id.chronometer2);
        rd_discount = (RadioGroup)findViewById(R.id.rad_discount);
        rd_datetime = (RadioGroup)findViewById(R.id.rad_datetime);
        rbtn_discount1 = (RadioButton)findViewById(R.id.rbtn_default);
        rbtn_discount2 = (RadioButton)findViewById(R.id.rbtn_cash);
        rbtn_discount3 = (RadioButton)findViewById(R.id.rbtn_membership);
        rbtn_date = (RadioButton)findViewById(R.id.rbtn_datepick);
        rbtn_time = (RadioButton)findViewById(R.id.rbtn_timepick);
        adult = (EditText)findViewById(R.id.inputAdult);
        young = (EditText)findViewById(R.id.inputYoung);
        child = (EditText)findViewById(R.id.inputChild);
        d_pick = (CalendarView)findViewById(R.id.calendarView);
        t_pick = (TimePicker)findViewById(R.id.timePicker);
        customer = (LinearLayout)findViewById(R.id.reserve_customer);
        datetimepick = (LinearLayout)findViewById(R.id.reserve_time);
        customer.setVisibility(View.INVISIBLE);
        datetimepick.setVisibility(View.INVISIBLE);

        start_switch.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    reserve_chrono.setBase(SystemClock.elapsedRealtime());
                    reserve_chrono.start();
                    String strColor = "#0000FF";
                    reserve_chrono.setTextColor(Color.parseColor(strColor));
                    customer.setVisibility(View.VISIBLE);
                }
                else {
                    reserve_chrono.setBase(SystemClock.elapsedRealtime());
                    reserve_chrono.stop();
                    String strColor = "#000000";
                    reserve_chrono.setTextColor(Color.parseColor(strColor));
                    customer.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
