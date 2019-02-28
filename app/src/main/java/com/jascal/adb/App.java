package com.jascal.adb;

import android.app.Application;

import java.util.HashMap;
import java.util.Map;

public class App extends Application {

    private Map<String, String> map = new HashMap<>();

    @Override
    public void onCreate() {
        super.onCreate();

    }

    public void setValue(String key, String value) {
        map.put(key, value);
    }

    public String getValue(String key) {
        return map.get(key);
    }
}
