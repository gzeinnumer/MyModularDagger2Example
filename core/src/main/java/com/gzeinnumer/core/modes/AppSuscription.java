package com.gzeinnumer.core.modes;

import com.gzeinnumer.core.resource.StringsProvider;

public class AppSuscription {
    StringsProvider stringsProvider;

    public AppSuscription(StringsProvider stringsProvider) {
        this.stringsProvider = stringsProvider;
    }

    public String getUserSuscription(){
        return "Free App";
    }
}
