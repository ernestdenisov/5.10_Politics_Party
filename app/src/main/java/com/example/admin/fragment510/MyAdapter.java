package com.example.admin.fragment510;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Admin on 11.07.15.
 */
public class MyAdapter extends FragmentPagerAdapter {
    Context ctxt = null;
    public MyAdapter(Context ctxt, FragmentManager fm) {
        super(fm);
        this.ctxt = ctxt;
    }

    @Override
    public int getCount() {
        return (5);
    }

    @Override
    public Fragment getItem(int position){
        return(PageFragment.newInstance(position));
    }

    @Override
    public String getPageTitle(int position) {
        return(PageFragment.getTitle(ctxt, position));
    }
}
