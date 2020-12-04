package com.gzeinnumer.module_1.di.module;

import android.content.Context;

import com.gzeinnumer.module_1.ui.Module_1_VM;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class Module_1_Module {

    @Provides
    @Singleton
    Module_1_VM sumUseCaseForModule1(Context context){
        return new Module_1_VM(context);
    }

    @Provides
    @Singleton
    @Named("Module1")
    String corePlusModule1(String string){
        return string+" Plus Module_1_Module";
    }
}
