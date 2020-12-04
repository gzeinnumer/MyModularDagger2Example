package com.gzeinnumer.module_2.di.provider;

import com.gzeinnumer.core.di.CoreModule;
import com.gzeinnumer.module_2.Module_2_Activity;
import com.gzeinnumer.module_2.di.Module_2_Component;
import com.gzeinnumer.module_2.di.Module_2_Module;

import javax.inject.Singleton;

import dagger.Component;


public interface Module_2_ComponentProvider {
    Module_2_Component getModule_2_Component();
}
