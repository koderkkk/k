package com.cnbeta.fk.kewei.k;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseIntArray;

public class MainActivity extends AppCompatActivity {


    public static final int PAGE_HOME = 0;
    public static final int PAGE_HOT_ARTICLES = 1;
    public static final int PAGE_HOT_COMMENTS = 2;

    //SparseIntArray取代了HashMap
    private static SparseIntArray INDEX_ID_MAPPING = new SparseIntArray();

    static{
//        INDEX_ID_MAPPING.put();//TODO
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


}
