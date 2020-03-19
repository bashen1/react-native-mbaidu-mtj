
package com.maochunjie.mbaidu;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;

import com.facebook.react.bridge.*;
import com.facebook.react.uimanager.events.RCTEventEmitter;

import java.util.HashMap;
import java.util.Map;

public class RNReactNativeMbaiduTJModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;


    public RNReactNativeMbaiduTJModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNReactNativeMbaiduTJ";
    }
}