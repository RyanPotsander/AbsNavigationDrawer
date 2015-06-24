package com.bearcub.absnavigationdrawer;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.bearcub.absnavigationdrawerlibrary.AbstractNavigationDrawer;
import com.bearcub.absnavigationdrawerlibrary.NavigationDrawerItem;
import com.bearcub.recyclerviewlibrary.ExtRecyclerView;

/**
 * Created by Home on 6/12/2015.
 */
public class MainActivity extends AppCompatActivity implements ExtRecyclerView.OnTouchItemSelectedListener, AbstractNavigationDrawer.OnTouchNavigationItemSelectedListener{
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setUpToolbar();
        setUpNavigationDrawer();

    }

    public void setUpNavigationDrawer(){
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        int fragmentId = R.id.fragment_nav;
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationDrawerFragment fragment = (NavigationDrawerFragment) fm.findFragmentById(R.id.fragment_nav);
        fragment.initDrawer(fragmentId, drawerLayout, toolbar, R.string.drawer_open,
                R.string.drawer_closed);
    }

    public void setUpToolbar(){
        toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public void onTouchItemSelected(View view, int position) {
        Toast.makeText(this, "you touched the item at position " + position, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onTouchNavigationItemSelected(View view, int position) {
        Toast.makeText(this, "you touched the item at position " + position, Toast.LENGTH_LONG).show();
    }
}
