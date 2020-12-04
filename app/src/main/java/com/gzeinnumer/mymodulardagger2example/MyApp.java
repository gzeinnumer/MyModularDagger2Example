package com.gzeinnumer.mymodulardagger2example;

import android.app.Application;

import com.gzeinnumer.core.di.CoreModule;
import com.gzeinnumer.module_1.di.DaggerModule_1_Component;
import com.gzeinnumer.module_1.di.Module_1_Component;
import com.gzeinnumer.module_1.di.provider.Module_1_ComponentProvider;
import com.gzeinnumer.module_2.di.DaggerModule_2_Component;
import com.gzeinnumer.module_2.di.Module_2_Component;
import com.gzeinnumer.module_2.di.provider.Module_2_ComponentProvider;
import com.gzeinnumer.mymodulardagger2example.di.AppComponent;
import com.gzeinnumer.mymodulardagger2example.di.DaggerAppComponent;
import com.gzeinnumer.mymodulardagger2example.di.provider.AppComponentProvider;

public class MyApp extends Application implements AppComponentProvider, Module_1_ComponentProvider, Module_2_ComponentProvider {

    CoreModule coreModule;

    @Override
    public void onCreate() {
        super.onCreate();
        coreModule = new CoreModule(this);
    }

    @Override
    public AppComponent getApplicationComponent() {
        return DaggerAppComponent.builder().coreModule(coreModule).build();
    }

    @Override
    public Module_1_Component getModule_1_Component(){
        return DaggerModule_1_Component.builder().coreModule(coreModule).build();
    }

    @Override
    public Module_2_Component getModule_2_Component() {
        return DaggerModule_2_Component.builder().coreModule(coreModule).build();
    }
}
