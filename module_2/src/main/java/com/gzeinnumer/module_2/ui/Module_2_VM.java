package com.gzeinnumer.module_2.ui;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

//@Singleton
public class Module_2_VM {

    Context context;

    @Inject
    public Module_2_VM(Context context) {
        this.context = context;
    }

    public int execute(int first, int second){
        return first+second;
    }
}
