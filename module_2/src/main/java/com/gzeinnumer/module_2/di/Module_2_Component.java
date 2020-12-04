package com.gzeinnumer.module_2.di;


import com.gzeinnumer.core.di.CoreModule;
import com.gzeinnumer.module_2.Module_2_Activity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                Module_2_Module.class,
                CoreModule.class
        }
)
public interface Module_2_Component {
    void inject(Module_2_Activity module_2_activity);
}
