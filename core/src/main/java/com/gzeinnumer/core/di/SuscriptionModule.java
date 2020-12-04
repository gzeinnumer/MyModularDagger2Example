package com.gzeinnumer.core.di;

import com.gzeinnumer.core.modes.AppSuscription;
import com.gzeinnumer.core.resource.StringsProvider;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        includes = {
                CoreModule.class
        }
)
public class SuscriptionModule {

    @Provides
    @Singleton
    public AppSuscription appSuscription(StringsProvider stringsProvider){
        return new AppSuscription(stringsProvider);
    }
}
