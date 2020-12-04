package com.gzeinnumer.module_2.di;


import com.gzeinnumer.core.di.module.CoreModule;
import com.gzeinnumer.module_2.di.module.Module_2_Module;
import com.gzeinnumer.module_2.ui.Module_2_Activity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                CoreModule.class,
                Module_2_Module.class
        }
)
public interface Module_2_Component {
    void inject(Module_2_Activity module_2_activity);
}
