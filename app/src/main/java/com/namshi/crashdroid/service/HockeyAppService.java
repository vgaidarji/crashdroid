package com.namshi.crashdroid.service;

import android.content.Context;

import com.namshi.crashdroid.R;

/**
 * HockeyApp crash service.
 * Created by vgaidarji on 10/15/15.
 */
public class HockeyAppService extends CrashService{

    public static final int ID = 1;

    public HockeyAppService(Context context) {
        super(context);
    }

    @Override
    String getName() {
        return context.getString(R.string.hockey_app);
    }

    @Override
    int getId() {
        return ID;
    }
}