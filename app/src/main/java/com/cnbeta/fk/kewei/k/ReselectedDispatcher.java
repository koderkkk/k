package com.cnbeta.fk.kewei.k;

import android.support.annotation.IdRes;

/**
 * Created by KeWei on 2018/08/29.
 * BNV的item选择监听器
 */
public interface ReselectedDispatcher {

    void addOnReselectListerner(@IdRes int interestItemId, OnReselectListener l);

    void removeOnReselectListener(OnReselectListener l);

    interface OnReselectListener {
        void onReselect();
    }
}
