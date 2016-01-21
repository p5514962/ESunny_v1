package com.eascs.app.mylibrary;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import de.greenrobot.event.EventBus;

/**
 *
 */
public abstract class BaseActivity extends AppCompatActivity {

    protected abstract void setContentLayout();
    protected abstract void initViews();
    protected abstract void initVariables();
    protected abstract void initData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
        setContentLayout();//设置布局资源文件或对应布局view
        initViews();//初始化views
        initVariables();//初始化变量
        initData();//初始化页面数据，如调用API接口
    }


    //============生命周期方法============//
    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    //============储存恢复数据方法============//
    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }


    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

//    public onEvent(){
//
//    }


}
