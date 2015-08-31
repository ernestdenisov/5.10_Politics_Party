package com.example.admin.fragment510;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 *
 */

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(new MyAdapter(this, getSupportFragmentManager()));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Intent intent = new Intent(this, MenuActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.donate) {
            Intent intent2 = new Intent(this, MenuActivityTwo.class);
            startActivity(intent2);
            return true;
        }
        if (id == R.id.autor) {
            Intent intent3 = new Intent(this, MenuActivityThree.class);
            startActivity(intent3);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
