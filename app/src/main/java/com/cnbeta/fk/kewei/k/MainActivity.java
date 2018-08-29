package com.cnbeta.fk.kewei.k;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.SparseIntArray;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    public static final int PAGE_HOME = 0;
    public static final int PAGE_HOT_ARTICLES = 1;
    public static final int PAGE_HOT_COMMENTS = 2;

    //SparseIntArray取代了HashMap
    private static SparseIntArray INDEX_ID_MAPPING = new SparseIntArray();

    static {
//        INDEX_ID_MAPPING.put();//TODO
    }

    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.appbar)
    AppBarLayout mAppbar;
    @BindView(R.id.pager)
    ViewPager mPager;
    @BindView(R.id.shadow_container)
    FrameLayout mShadowContainer;
    @BindView(R.id.bottom_bar)
    BottomNavigationView mBottomBar;

    //初始化各个控件


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        setSupportActionBar(mToolbar);


    }


}
