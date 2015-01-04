package com.sparks.bhargavi.indiachat;

import android.app.Application;

public class MainApplication extends Application{
    private static MainApplication me;

    public static MainApplication getApplication() {
        return me;
    }

}
