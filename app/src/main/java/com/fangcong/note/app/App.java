package com.fangcong.note.app;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;

/**
 * Created by XhinLiang on 2017/5/13.
 * xhinliang@gmail.com
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AVOSCloud.initialize(this, "DzU1JR06AAbWJuflCH5odyuX-gzGzoHsz", "8BLcu3SDDW9D7QOkzWPUuKpU");
    }
}
