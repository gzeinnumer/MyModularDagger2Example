package com.gzeinnumer.core.resource;

import android.app.Application;

public class StringsProvider {
    Application application;
    public StringsProvider(Application application){
        this.application = application;
    }

    public String getString(int id){
        return application.getString(id);
    }
}
