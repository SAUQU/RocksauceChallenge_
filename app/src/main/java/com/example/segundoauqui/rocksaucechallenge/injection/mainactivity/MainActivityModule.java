package com.example.segundoauqui.rocksaucechallenge.injection.mainactivity;

import com.example.segundoauqui.rocksaucechallenge.view.mainactivity.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by segundoauqui on 11/1/17.
 */
@Module
public class MainActivityModule {

    @Provides
    MainActivityPresenter providerMainActivityPresenter(){return new MainActivityPresenter();
    }
}
