package com.cnbeta.fk.kewei.k.home;

import android.app.Activity;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by KeWei on 2018/08/29.
 */
public class BaseFragment extends Fragment{

    //获取ActionBar
    public ActionBar getSupportActionBar(){
        Activity activity = getActivity();
        if(activity!=null&&activity instanceof AppCompatActivity){
            ActionBar actionBar = ((AppCompatActivity) activity).getSupportActionBar();
            if(actionBar!=null){
                return actionBar;
            }
        }
        return null;
    }

    //设置标题
    public void setActionBarTitle(String title) {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle(title);
        }
    }

    //根据资源id设置标题
    public void setActionBarTitle(int strRes) {
        String title = getString(strRes);
        setActionBarTitle(title);
    }
}
