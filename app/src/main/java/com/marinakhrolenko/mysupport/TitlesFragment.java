package com.marinakhrolenko.mysupport;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Администратор on 17.02.2015.
 */
public class TitlesFragment extends Fragment  {

    String[] mForList={"one","two","three"};

    private OnTitleClickListener mTitleClickListener;

    public interface OnTitleClickListener {
        void onTitleClick(String title);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mTitleClickListener = (MainActivity) activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_titles, container, false);
       ArrayAdapter adapter=new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_titles,
                R.id.textI,
                mForList);
        ListView listView=(ListView) v.findViewById(R.id.listV);
       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mTitleClickListener.onTitleClick(mForList[position]);
            }
        });

        listView.setAdapter(adapter);

        return v;
    }
}


