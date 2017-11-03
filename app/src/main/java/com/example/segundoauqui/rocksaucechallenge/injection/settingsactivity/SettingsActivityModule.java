package com.example.segundoauqui.rocksaucechallenge.injection.settingsactivity;

import com.example.segundoauqui.rocksaucechallenge.view.settingsactivity.SettingsActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by segundoauqui on 11/1/17.
 */

@Module
public class SettingsActivityModule {

    @Provides
    SettingsActivityPresenter providerSettingsActivityPresenter() {
        return new SettingsActivityPresenter();
    }
}
