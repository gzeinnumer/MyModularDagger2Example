package com.gzeinnumer.module_1.di;

import com.gzeinnumer.core.di.module.CoreModule;
import com.gzeinnumer.module_1.di.module.Module_1_Module;
import com.gzeinnumer.module_1.ui.Module_1_Activity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                CoreModule.class,
                Module_1_Module.class
        }
)
public interface Module_1_Component {
     void inject(Module_1_Activity module1Activity);
}
