package com.gzeinnumer.module_1.di;

import com.gzeinnumer.core.di.CoreModule;
import com.gzeinnumer.module_1.Module_1_Activity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                Module_1_Module.class,
                CoreModule.class
        }
)
public interface Module_1_Component {
     void inject(Module_1_Activity module1Activity);
}
