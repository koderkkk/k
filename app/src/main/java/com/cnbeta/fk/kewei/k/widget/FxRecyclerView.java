package com.cnbeta.fk.kewei.k.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by KeWei on 2018/08/29.
 * 自定义RecyclerView
 */
public class FxRecyclerView extends RecyclerView {

    public static final int SMOOTH_SCROLL_NEED_FASTER_POSITION = 25;

    public FxRecyclerView(@NonNull Context context) {
        super(context);
    }

    public FxRecyclerView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public FxRecyclerView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    //不是很懂这个方法的滚动方式?//TODO
    public void smoothScrollToFirstItem() {
        //这个无法ctrl alt v 自动生成需要自己写前面变量.
        //getLayoutManager().findFirstVisibleItemPosition();会自动添加(LinearLayoutManager)
        int firstVisibleItem = ((LinearLayoutManager) getLayoutManager())
                .findFirstVisibleItemPosition();
        if (firstVisibleItem > SMOOTH_SCROLL_NEED_FASTER_POSITION) {
            scrollToPosition(SMOOTH_SCROLL_NEED_FASTER_POSITION);
        }
        smoothScrollToPosition(0);

    }
}
