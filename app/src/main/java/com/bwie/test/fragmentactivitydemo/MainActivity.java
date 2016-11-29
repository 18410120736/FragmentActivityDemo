package com.bwie.test.fragmentactivitydemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener ,Fragment01.CallBack {

    private ViewPager vp;
    private TextView te1;
    private TextView te2;
    private ArrayList<TextView> list;
    private String title="床前明月光，疑是地上霜。";
    private String name;
    private TextView te;
    private Button bu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("onCreate---------------------------------------");
        //初始化控件
        initView();
        initdata();
        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }



    private void initdata() {
        vp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }
            //点击按钮变色
            @Override
            public void onPageSelected(int position) {
                 for(int i=0;i<list.size();i++){
                     if(i==position){
                         list.get(i).setTextColor(Color.RED);
                     }else{
                         list.get(i).setTextColor(Color.BLACK);
                     }
                 }
            }
            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        vp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                Fragment fragment=null;
                switch (position){
                    case 0:
                        fragment=Fragment01.getfra(title);
                        break;
                    case 1:
                        fragment=new Fragment02();
                        break;
                }
                return fragment;
            }

            @Override
            public int getCount() {
                return 2;
            }
        });
    }

    private void initView() {
        te = (TextView) findViewById(R.id.te5);
        bu = (Button) findViewById(R.id.bu);
        vp = (ViewPager) findViewById(R.id.vp);
        te1 = (TextView) findViewById(R.id.te1);
        te2 = (TextView) findViewById(R.id.te2);
        list = new ArrayList<>();
        list.add(te1);
        list.add(te2);
        for(int i=0;i<list.size();i++){
            list.get(i).setOnClickListener(MainActivity.this);
        }
    }
    //监听按钮  当我们点击一个按钮时，显示与之对应的Fragment
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.te1:
                vp.setCurrentItem(0);
                break;
            case R.id.te2:
                vp.setCurrentItem(1);
                break;
        }
    }
    @Override
    protected void onStart() {
        System.out.println("onStart---------------------------------------");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        System.out.println("onRestart---------------------------------------");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        System.out.println("onResume---------------------------------------");
        super.onResume();
    }

    @Override
    protected void onPause() {
        System.out.println("onPause---------------------------------------");
        super.onPause();
    }

    @Override
    protected void onStop() {
        System.out.println("onStop---------------------------------------");
        super.onStop();
}

    @Override
    protected void onDestroy() {
        System.out.println("onDestroy---------------------------------------");
        super.onDestroy();
    }
    //实现接口里的方法
    @Override
    public void getData(String data) {
        te.setText(data);
    }
}
