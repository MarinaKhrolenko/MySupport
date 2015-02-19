package com.marinakhrolenko.mysupport;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;


public class MainActivity extends ActionBarActivity implements TitlesFragment.OnTitleClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    public void onTitleClick(String title) {
        if (findViewById(R.id.det_frag) == null) {
            Intent intent = new Intent(this, DetailsActivity.class);
            intent.putExtra("item",title);
            startActivity(intent);
        } else {
            DetailsFragment fragment = (DetailsFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.det_frag);
            if (fragment != null) {
                fragment.restartText(title);
            }
        }
    }
}


