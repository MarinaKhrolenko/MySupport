package com.marinakhrolenko.mysupport;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Администратор on 17.02.2015.
 */
public class DetailsFragment extends Fragment {

    private String mItem;
    TextView tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        if (args != null) {
            mItem = args.getString("item");
        }
          }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_details, container, false);
        tv = (TextView) v.findViewById(R.id.tv);

        if (!TextUtils.isEmpty(mItem)) {
           restartText(mItem);
        }
        return v;
    }

    public static DetailsFragment newInstance(String someStr) {
        DetailsFragment frag = new DetailsFragment();
        Bundle args = new Bundle();
        args.putString("item", someStr);
        frag.setArguments(args);
        return frag;
    }

    public View restartText(String mItem) {
            tv.setText(mItem);
            return tv;
    }
    }



