package com.gzeinnumer.module_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.gzeinnumer.module_2.di.provider.Module_2_ComponentProvider;

import javax.inject.Inject;

public class Module_2_Activity extends AppCompatActivity {

    private static final String TAG = "Module_2_Activity";

    @Inject
    String str;

    @Inject
    Module_2_VM module1VM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_2_);

        ((Module_2_ComponentProvider) getApplication()).getModule_2_Component().inject(this);


        int sum = module1VM.excedute(10, 50);

        Log.d(TAG, "onCreate: "+sum);
        Log.d(TAG, "onCreate: "+str);
    }
}