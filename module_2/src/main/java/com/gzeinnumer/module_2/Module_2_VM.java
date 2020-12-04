package com.gzeinnumer.module_2;

import com.gzeinnumer.core.resource.StringsProvider;

public class Module_2_VM {

    StringsProvider stringsProvider;

    public Module_2_VM(StringsProvider stringsProvider) {
        this.stringsProvider = stringsProvider;
    }

    public int excedute(int first, int second){
        return first+second;
    }
}
