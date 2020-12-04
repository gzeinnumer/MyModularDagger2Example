package com.gzeinnumer.module_2.di;

import com.gzeinnumer.core.resource.StringsProvider;
import com.gzeinnumer.module_2.Module_2_VM;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class Module_2_Module {
    @Provides
    @Singleton
    Module_2_VM sumUseCase(StringsProvider stringsProvider){
        return new Module_2_VM(stringsProvider);
    }
}
