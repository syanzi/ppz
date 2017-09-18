package com.weathmc.mvp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.weathmc.R;
import com.weathmc.model.WeatherBean;
import com.weathmc.utils.HttpConfig;
import com.weathmc.utils.HttpUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.tab_layout)
    TabLayout mTabLayout;
    @BindView(R.id.view_pager)
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);
        CollapsingToolbarLayout mCollapsingToolbarLayout= (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout);

        mCollapsingToolbarLayout.setTitle("明聪天气");
        //通过CollapsingToolbarLayout修改字体颜色
        mCollapsingToolbarLayout.setExpandedTitleColor(Color.WHITE);//设置还没收缩时状态下字体颜色
        mCollapsingToolbarLayout.setCollapsedTitleTextColor(Color.GREEN);//设置收缩后Toolbar上字体的颜色

    }

    @Override
    protected void onResume() {
        super.onResume();
        getWeath();

    }

    public void getWeath() {
        HttpUtil.getInstance().getWeathApi(new Callback<WeatherBean>() {
            @Override
            public void onResponse(Call<WeatherBean> call, Response<WeatherBean> response) {
                Log.e(TAG, "onResponsecode: " + response.code());
                if (response.isSuccessful() && response.body() != null) {
                    WeatherBean weathBean = response.body();
                    if (weathBean.getCode() == 1 && HttpConfig.SUCESS.equals(weathBean.getMsg())) {
                        Log.e(TAG, "onResponse: " + weathBean.getCode() + ":" + weathBean.getMsg() + "counts:" + weathBean.getCounts());
                        Log.e(TAG, "city: " + weathBean.getData().getCityName());
                        Log.e(TAG, "day: " + weathBean.getData().getList()[0].getTq1());
                    }

                }
            }

            @Override
            public void onFailure(Call<WeatherBean> call, Throwable t) {
                Log.e(TAG, "onFailure: ", t);

            }
        });
    }
}
