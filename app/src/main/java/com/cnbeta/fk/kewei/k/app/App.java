package com.cnbeta.fk.kewei.k.app;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by KeWei on 2018/08/28.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化leakcanary
        if(LeakCanary.isInAnalyzerProcess(this)){
            return;
        }
        LeakCanary.install(this);
    }
}
