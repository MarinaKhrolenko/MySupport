package com.marinakhrolenko.mysupport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by Администратор on 17.02.2015.
 */
public class DetailsActivity extends ActionBarActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);

        Intent intent=getIntent();
        String details=intent.getStringExtra("item");

        Fragment frag=DetailsFragment.newInstance(details);
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.linearInfo,frag);
        fragmentTransaction.commit();
    }
}
