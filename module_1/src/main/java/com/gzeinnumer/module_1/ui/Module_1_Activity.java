package com.gzeinnumer.module_1.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.gzeinnumer.module_1.R;
import com.gzeinnumer.module_1.di.provider.Module_1_ComponentProvider;

import javax.inject.Inject;
import javax.inject.Named;

public class Module_1_Activity extends AppCompatActivity {

    private static final String TAG = "Module_1_Activity";

    @Inject
    @Named("Module1")
    String str;

    @Inject
    Module_1_VM module1VM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_1_);

        ((Module_1_ComponentProvider) getApplication()).getModule_1_Component().inject(this);

        int sum = module1VM.execute(10, 20);

        Log.d(TAG, "onCreate: "+sum);
        Log.d(TAG, "onCreate: "+str);
    }
}