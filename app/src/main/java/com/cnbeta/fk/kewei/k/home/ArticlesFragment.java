package com.cnbeta.fk.kewei.k.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cnbeta.fk.kewei.k.R;

/**
 * Created by KeWei on 2018/08/29.
 */
public class ArticlesFragment extends BaseFragment {

    public static final String KEY_TOPIC_ID = "topic_id";

    //创建ArticlesFragment
    public static Fragment newInstance(String topicId) {
        ArticlesFragment articlesFragment = new ArticlesFragment();
        //官方推荐Fragment.setArguments(Bundle bundle)这种方式来传递参数，而不推荐通过构造方法直接来传递参数
        Bundle bundle = new Bundle();
        bundle.putString(KEY_TOPIC_ID,topicId);
        articlesFragment.setArguments(bundle);
        return articlesFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_articles, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
