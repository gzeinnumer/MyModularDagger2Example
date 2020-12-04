package com.gzeinnumer.module_1.di;

import com.gzeinnumer.core.resource.StringsProvider;
import com.gzeinnumer.module_1.Module_1_VM;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class Module_1_Module {
    @Provides
    @Singleton
    Module_1_VM sumUseCase(StringsProvider stringsProvider){
        return new Module_1_VM(stringsProvider);
    }
}
