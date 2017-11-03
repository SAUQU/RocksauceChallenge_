package com.example.segundoauqui.rocksaucechallenge;

/**
 * Created by segundoauqui on 11/1/17.
 */

public interface BasePresenter <V extends BaseView>{
    void attachView(V view);
    void detachView();

}
