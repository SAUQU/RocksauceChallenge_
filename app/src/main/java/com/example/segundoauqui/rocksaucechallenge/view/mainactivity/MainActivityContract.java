package com.example.segundoauqui.rocksaucechallenge.view.mainactivity;

import com.example.segundoauqui.rocksaucechallenge.BasePresenter;
import com.example.segundoauqui.rocksaucechallenge.BaseView;
import com.example.segundoauqui.rocksaucechallenge.model.Data_;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Retrofit;

/**
 * Created by segundoauqui on 11/1/17.
 */

public interface MainActivityContract {
    interface  View extends BaseView{
        void sendInfo(ArrayList<Data_> value);

        void getAllPostList(List<Data_> getAllPostList) throws IOException;

    }

    interface Presenter extends BasePresenter<MainActivityContract.View>{

        void restCall();
    }



}
