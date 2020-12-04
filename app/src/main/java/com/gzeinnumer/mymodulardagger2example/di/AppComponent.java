package com.gzeinnumer.mymodulardagger2example.di;

import com.gzeinnumer.core.di.SuscriptionModule;
import com.gzeinnumer.mymodulardagger2example.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                SuscriptionModule.class
        }
)
public interface AppComponent {

    void inject(MainActivity activity);
}
