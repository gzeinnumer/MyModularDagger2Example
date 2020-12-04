package com.gzeinnumer.core.di.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CoreModule {
    Application application;
    public CoreModule(Application application){
        this.application = application;
    }

    @Provides
    @Singleton
    public Context providesContext(){
        return application.getApplicationContext();
    }

    @Provides
    @Singleton
    public String providesString(){
        return "String Provides";
    }
}
