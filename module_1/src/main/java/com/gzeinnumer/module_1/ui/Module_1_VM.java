package com.gzeinnumer.module_1.ui;

import android.content.Context;

public class Module_1_VM {
    Context context;

    public Module_1_VM(Context context) {
        this.context = context;
    }

    public int execute(int first, int second){
        return first+second;
    }
}
