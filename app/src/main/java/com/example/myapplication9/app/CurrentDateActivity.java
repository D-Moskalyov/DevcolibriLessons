package com.example.myapplication9.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Calendar;


public class CurrentDateActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_date);

        TextView txtDate = (TextView)findViewById(R.id.txtDate);
        txtDate.setText(Calendar.getInstance().getTime().toString());
    }

}
