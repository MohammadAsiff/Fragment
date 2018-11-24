package com.example.sys.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Fragment_1 fragment1 = new Fragment_1();
       FragmentManager manager = getSupportFragmentManager();
       FragmentTransaction transaction = manager.beginTransaction();
       transaction.add( R.id.f1,fragment1 );
        transaction.commit();
  Fragment2 fragment2 = new Fragment2();
       FragmentManager manager2 = getSupportFragmentManager();
       FragmentTransaction transaction2 = manager.beginTransaction();
       transaction2.add( R.id.f2,fragment2 );
        transaction2.commit();


    }
}
