package com.gzeinnumer.module_2.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.gzeinnumer.module_2.R;
import com.gzeinnumer.module_2.di.provider.Module_2_ComponentProvider;

import javax.inject.Inject;
import javax.inject.Named;

public class Module_2_Activity extends AppCompatActivity {

    private static final String TAG = "Module_2_Activity";

    @Inject
    @Named("Module2")
    String str;

    @Inject
    Module_2_VM module2VM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_2_);

        ((Module_2_ComponentProvider) getApplication()).getModule_2_Component().inject(this);

        int sum = module2VM.execute(10, 50);

        Log.d(TAG, "onCreate: "+sum);
        Log.d(TAG, "onCreate: "+str);
    }
}