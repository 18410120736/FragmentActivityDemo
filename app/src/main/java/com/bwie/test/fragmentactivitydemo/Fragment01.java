package com.bwie.test.fragmentactivitydemo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by 123 on 2016/11/29.
 */
// Created by  on 2016/11/
public class Fragment01 extends Fragment{

    private View view;
    private TextView te;
    CallBack call;
    @Override
    public void onAttach(Context context) {
        System.out.println("onAttach1+++++++++++++++++++++++++++++++++++");
        super.onAttach(context);
        call=(CallBack)getActivity();

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        System.out.println("onCreate1+++++++++++++++++++++++++++++++++++");
        super.onCreate(savedInstanceState);
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        System.out.println("onCreateView1+++++++++++++++++++++++++++++++++++");
        view = inflater.inflate(R.layout.fragment01,container,false);
        te = (TextView) view.findViewById(R.id.text);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        System.out.println("onActivityCreated1+++++++++++++++++++++++++++++++++++");
        super.onActivityCreated(savedInstanceState);
        //获得值
        Bundle b=getArguments();
        String title=b.getString("title");
        te.setText(title);
        call.getData("我真是太幸福了！");


    }

    @Override
    public void onStart() {
        System.out.println("onStart1+++++++++++++++++++++++++++++++++++");
        super.onStart();
    }

    @Override
    public void onResume() {
        System.out.println("onResume1+++++++++++++++++++++++++++++++++++");
        super.onResume();
    }

    @Override
    public void onPause() {
        System.out.println("onPause1+++++++++++++++++++++++++++++++++++");
        super.onPause();
    }

    @Override
    public void onStop() {
        System.out.println("onStop1+++++++++++++++++++++++++++++++++++");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        System.out.println("onDestroyView1+++++++++++++++++++++++++++++++++++");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        System.out.println("onDestroy1+++++++++++++++++++++++++++++++++++");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        System.out.println("onDetach1+++++++++++++++++++++++++++++++++++");
        super.onDetach();
    }
    //利用Bundle来实现Activity向Fragment传值
    public static Fragment getfra(String title){
        //创建Fragment对象
        Fragment01 fr=new Fragment01();
        //创建Bundle对象
        Bundle b=new Bundle();
        //把传过来的值放入Bundle中
        b.putString("title",title);
        //把bundle放入fragment对象中
        fr.setArguments(b);
        return fr;
    }
    //利用set,get方法来实现fragment向fragment传值
    public static Bean getBean(){
        Bean bean=new Bean();
        bean.setmTitle("我爱你，你爱我吗？");
        return bean;
    }
    //创建一个接口
    public interface CallBack
    {
        public void getData(String data);
    }

}
