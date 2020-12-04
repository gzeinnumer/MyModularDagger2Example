package com.gzeinnumer.module_1;

import com.gzeinnumer.core.resource.StringsProvider;

public class Module_1_VM {
    StringsProvider stringsProvider;

    public Module_1_VM(StringsProvider stringsProvider) {
        this.stringsProvider = stringsProvider;
    }

    public int exceute(int first, int second){
        return first+second;
    }
}
