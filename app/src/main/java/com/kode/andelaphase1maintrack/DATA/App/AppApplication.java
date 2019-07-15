package com.kode.andelaphase1maintrack.DATA.App;

import android.app.Application;
import android.content.Context;

public class AppApplication extends Application {

    //Define the member variables here
    private static Context mContext;
    private static AppApplication mInstance;


    @Override
    public void onCreate() {
        super.onCreate();

        mContext = getApplicationContext();
        mInstance = this;
    }


    /**
     * Create the context for this application once whenever the app opens
     * @return Context
     * **/
    public static Context getAppContext() {
        return mContext;
    }


    /**
     * Create an instance of this Singleton class once whenever the app opens
     * @return AppApplication
     * **/
    public static AppApplication getInstance() {
        return mInstance;
    }



}
