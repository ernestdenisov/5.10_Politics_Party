package com.example.admin.fragment510;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Admin on 13.07.15.
 */
public class MenuActivityTwo extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_two);

        TextView tv = (TextView)findViewById(R.id.menuTV2);
        tv.setText(R.string.donate_text);

    }
}
