package com.example.segundoauqui.rocksaucechallenge.injection.settingsactivity;

import com.example.segundoauqui.rocksaucechallenge.view.settingsactivity.SettingsActivity;

import dagger.Component;

/**
 * Created by segundoauqui on 11/1/17.
 */
@Component(modules = SettingsActivityModule.class)
public interface SettingsActivityComponent {

    void inject(SettingsActivity SettingsActivity);

}
