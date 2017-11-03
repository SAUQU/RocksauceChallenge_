package com.example.segundoauqui.rocksaucechallenge.view.settingsactivity;

import android.content.Context;

/**
 * Created by segundoauqui on 11/1/17.
 */

public class SettingsActivityPresenter implements SettingsActivityContract.Presenter {

    private  SettingsActivityContract.View view;

    private Context context;


    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public void attachView(SettingsActivityContract.View view) {
        this.view = view;
    }
    @Override
    public void detachView(){
        this.view = null;
    }

    @Override
    public void removeView(){
        this.view = null;
    }


}
