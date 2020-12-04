package com.gzeinnumer.mymodulardagger2example.di;

import com.gzeinnumer.core.di.module.CoreModule;
import com.gzeinnumer.mymodulardagger2example.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                CoreModule.class
        }
)
public interface AppComponent {

    void inject(MainActivity activity);
}
