package com.example.admin.fragment510;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Admin on 11.07.15.
 */
public class PageFragment extends android.support.v4.app.Fragment {
    private int pageNumber;

    public static PageFragment newInstance(int page) {
        PageFragment fragment = new PageFragment();
        Bundle args = new Bundle();
        args.putInt("num", page);
        fragment.setArguments(args);
        return fragment;
    }

    public PageFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageNumber = getArguments() != null ? getArguments().getInt("num") : 1;
    }

    static String getTitle(Context ctxt, int position) {
        String title = null;
        switch (position) {
            case 0:
                title = "ГЛАВНАЯ";
                break;
            case 1:
                title = "ПРОГРАММА";
                break;
            case 2:
                title = "ИСТОРИЯ";
                break;
            case 3:
                title = "ОФИСЫ";
                break;
            case 4:
                title = "КОНТАКТЫ";
                break;
        }

        return title;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View result = inflater.inflate(R.layout.fragment_page, container, false);

        TextView pageHeader = (TextView) result.findViewById(R.id.displayText);


        switch (pageNumber) {
            case 0:
                pageHeader.setText(R.string.first_page);
                pageHeader.setGravity(View.TEXT_ALIGNMENT_CENTER);
                pageHeader.setTextSize(50);

                break;
            case 1:
                pageHeader.setText(R.string.program_text);
                break;
            case 2:
                pageHeader.setText(R.string.history_text);
                break;
            case 3:
                pageHeader.setText(R.string.offices_text);
                break;
            case 4:
                pageHeader.setText(R.string.contact_text);
                //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://510.com.ua/contacts/"));
                //startActivity(intent);
                pageHeader.setLinksClickable(true);
                break;
            default:
                break;
        }

        //pageHeader.setText("Фрагмент"  + String.valueOf(pageNumber + 1));

        return result;
    }
}
