package com.example.admin.fragment510;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Admin on 13.07.15.
 */
public class MenuActivityThree extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_three);

        TextView tv3 = (TextView)findViewById(R.id.menuTV3);
        tv3.setText(R.string.autor_text);
    }
}
