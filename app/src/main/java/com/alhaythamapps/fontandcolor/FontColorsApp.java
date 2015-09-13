package com.alhaythamapps.fontandcolor;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by alhaythamalfeel on 9/13/15.
 */
public class FontColorsApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                        .setDefaultFontPath("fonts/BackToSchool.ttf")
                        .setFontAttrId(R.attr.fontPath)
                        .build()
        );
    }
}
