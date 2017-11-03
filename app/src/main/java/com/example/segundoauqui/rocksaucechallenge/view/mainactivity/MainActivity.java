package com.example.segundoauqui.rocksaucechallenge.view.mainactivity;

import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.segundoauqui.rocksaucechallenge.BaseView;
import com.example.segundoauqui.rocksaucechallenge.R;
import com.example.segundoauqui.rocksaucechallenge.injection.mainactivity.DaggerMainActivityComponent;
import com.example.segundoauqui.rocksaucechallenge.model.Data;
import com.example.segundoauqui.rocksaucechallenge.model.Data_;
import com.example.segundoauqui.rocksaucechallenge.model.Example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {


    MainActivityPresenter activityPresenter;
    ArrayList<Example>  example = new ArrayList<>();
    ArrayList<Data_> data = new ArrayList<>();
    ArrayList<CategoriesAdapter> categoriesAdapters = new ArrayList<>();
    LinearLayoutManager layoutManager;
    RecyclerView.ItemAnimator itemAnimator;
    RecyclerView recycler;
    MainActivityPresenter presenter;

    private SwipeRefreshLayout activityMainSwipeRefreshLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpDagger();
        presenter.attachView(this);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        itemAnimator = new DefaultItemAnimator();
        recycler.setLayoutManager(layoutManager);
        recycler.setItemAnimator(itemAnimator);
        recycler.setHasFixedSize(true);
        recycler.setItemViewCacheSize(20);
        recycler.setDrawingCacheEnabled(true);
        recycler.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        presenter.restCall();


    }


    @Override
    public void sendInfo(ArrayList<Data_> value) {
        CategoriesAdapter firstAdapter = new CategoriesAdapter(value);
        recycler.setAdapter(firstAdapter);
        firstAdapter.notifyDataSetChanged();

        this.data= value;
        activityMainSwipeRefreshLayout.setRefreshing(false);
    }

    public void setUpDagger(){
        DaggerMainActivityComponent.create().inject(this);
    }

    @Override
    public void showError(String s) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void getAllPostList(List<Data_> getAllPostList) {
        CategoriesAdapter firstAdapter = new CategoriesAdapter((ArrayList<Data_>) getAllPostList);
        recycler.setAdapter(firstAdapter);
        firstAdapter.notifyDataSetChanged();

        this.data= (ArrayList<Data_>) getAllPostList;
    }

    }

