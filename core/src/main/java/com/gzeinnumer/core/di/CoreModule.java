package com.gzeinnumer.core.di;

import android.app.Application;

import com.gzeinnumer.core.resource.StringsProvider;

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
    public StringsProvider stringProvider(){
        return new StringsProvider(application);
    }

    @Provides
    @Singleton
    public String providesString(){
        return "String Provides";
    }
}
