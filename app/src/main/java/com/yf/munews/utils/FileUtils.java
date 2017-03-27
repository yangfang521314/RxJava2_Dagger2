package com.yf.munews.utils;

import com.yf.munews.app.App;

import java.io.File;

/**
 * Created by ${yf} on 2017/3/20.
 */

public class FileUtils {

    /**
     * OkHttp
     * 缓存路径
     * @return
     */
    public static String getCacheFile() {
        String cache = App.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";
        return cache;
    }


}
