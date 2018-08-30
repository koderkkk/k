package com.cnbeta.fk.kewei.k;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.widget.FrameLayout;

import com.cnbeta.fk.kewei.k.home.ArticlesFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements ReselectedDispatcher {


    //viewpager页面标记
    public static final int PAGE_HOME = 0;
    public static final int PAGE_HOT_ARTICLES = 1;
    public static final int PAGE_HOT_COMMENTS = 2;

    //SparseIntArray取代了HashMap
    private static SparseIntArray INDEX_ID_MAPPING = new SparseIntArray();

    static {
//        INDEX_ID_MAPPING.put();//TODO
    }

    //初始化各个控件
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.appbar)
    AppBarLayout mAppbar;
    @BindView(R.id.pager)
    ViewPager mViewPager;
    @BindView(R.id.shadow_container)
    FrameLayout mShadowContainer;
    @BindView(R.id.bottom_bar)
    BottomNavigationView mBottomBar;

    private String[] mPageTitles;
    //监听器初始化
    private SparseArray<OnReselectListener> mOnReselectListerners;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        setSupportActionBar(mToolbar);

        //为什么创建这个数组?//TODO
        mPageTitles = new String[]{getString(R.string.nav_home), getString(R.string
                .nav_hot_articles), getString(R.string.nav_hot_comment)};

        mOnReselectListerners = new SparseArray<>(mPageTitles.length);

//        mViewPager.setAdapter();


    }


    //实现ReselectDispatcher重写添加选择监听器方法
    @Override
    public void addOnReselectListerner(int interestItemId, OnReselectListener onReselectListener) {
        //
        mOnReselectListerners.put(interestItemId, onReselectListener);
    }

    //实现ReselectDispatcher重写移除选择监听器方法
    @Override
    public void removeOnReselectListener(OnReselectListener onReselectListener) {
        //SparseArray的移除只能根据索引.所以要用indexOfValue获取索引值
        int key = mOnReselectListerners.indexOfValue(onReselectListener);
        mOnReselectListerners.remove(key);
    }


    //实现一个自己的FragmentPagerAdatper
    private class PagerAdapter extends FragmentPagerAdapter {
        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            switch (i) {
                case PAGE_HOME:
                    return ArticlesFragment.newInstance("null");
            }
            return null;
        }

        @Override
        public int getCount() {
            return 0;
        }
    }
}
