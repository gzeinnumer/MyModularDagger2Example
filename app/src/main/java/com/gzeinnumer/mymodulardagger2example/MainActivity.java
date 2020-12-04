package com.gzeinnumer.mymodulardagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.gzeinnumer.module_2.Module_2_Activity;
import com.gzeinnumer.mymodulardagger2example.di.provider.AppComponentProvider;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Inject
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((AppComponentProvider) getApplication()).getApplicationComponent().inject(this);

        Log.d(TAG, "onCreate: "+str);

        startActivity(new Intent(getApplicationContext(), Module_2_Activity.class));
    }
}