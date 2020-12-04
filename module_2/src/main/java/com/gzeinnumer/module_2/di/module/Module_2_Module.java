package com.gzeinnumer.module_2.di.module;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class Module_2_Module {

    @Provides
    @Singleton
    @Named("Module2")
    String corePlusModule2(String string){
        return string+" Plus Module_2_Module";
    }
}
