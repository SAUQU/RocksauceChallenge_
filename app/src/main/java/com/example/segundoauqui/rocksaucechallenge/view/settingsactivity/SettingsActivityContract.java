package com.example.segundoauqui.rocksaucechallenge.view.settingsactivity;

import com.example.segundoauqui.rocksaucechallenge.BasePresenter;
import com.example.segundoauqui.rocksaucechallenge.BaseView;

/**
 * Created by segundoauqui on 11/1/17.
 */

public interface SettingsActivityContract {

    interface View extends BaseView{

    }

    interface Presenter extends BasePresenter<View> {

        void removeView();
    }
}
