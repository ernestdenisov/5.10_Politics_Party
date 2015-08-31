package com.example.admin.fragment510;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MenuActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        TextView tv1 = (TextView)findViewById(R.id.menuTV);
        tv1.setText(R.string.enter_in_party);
    }
}
