package com.animalhaven.hansportable.myanimalhaven.Config;

import android.app.Application;
import android.content.Context;

/**
 * Created by Admin on 2016/05/12.
 */
public class GlobalContext extends Application {

    public static Context context;

    private static GlobalContext singleton;

    public void onCreate() {
        super.onCreate();
        GlobalContext.context = getApplicationContext();
        singleton = this;
    }

    public static Context getAppContext() {
        return GlobalContext.context;
    }

    public static synchronized GlobalContext getInstance() {
        return singleton;
    }
}
