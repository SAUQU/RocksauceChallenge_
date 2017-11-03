package com.example.segundoauqui.rocksaucechallenge.injection.mainactivity;

import com.example.segundoauqui.rocksaucechallenge.view.mainactivity.MainActivity;
import dagger.Component;

/**
 * Created by segundoauqui on 11/1/17.
 */


@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);
}
