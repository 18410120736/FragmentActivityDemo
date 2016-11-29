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
// Created by  on 2016/11/29.
public class Fragment02 extends Fragment{

    private View view;
    private TextView te;
    private TextView te1;
    @Override
    public void onAttach(Context context) {
        System.out.println("onAttach2+++++++++++++++++++++++++++++++++++");
        super.onAttach(context);

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        System.out.println("onCreate2+++++++++++++++++++++++++++++++++++");
        super.onCreate(savedInstanceState);
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        System.out.println("onCreateView2+++++++++++++++++++++++++++++++++++");
        view = inflater.inflate(R.layout.fragment02,container,false);
        te = (TextView) view.findViewById(R.id.text1);
        te1 = (TextView) view.findViewById(R.id.text2);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        System.out.println("onActivityCreated2+++++++++++++++++++++++++++++++++++");
        super.onActivityCreated(savedInstanceState);
        Bean bean1 = Fragment01.getBean();
        String title = bean1.getmTitle();
        te.setText(title);

    }
    public void onStart() {
        System.out.println("onStart2+++++++++++++++++++++++++++++++++++");
        super.onStart();
    }

    @Override
    public void onResume() {
        System.out.println("onResume2+++++++++++++++++++++++++++++++++++");
        super.onResume();
    }

    @Override
    public void onPause() {
        System.out.println("onPause2+++++++++++++++++++++++++++++++++++");
        super.onPause();
    }

    @Override
    public void onStop() {
        System.out.println("onStop2+++++++++++++++++++++++++++++++++++");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        System.out.println("onDestroyView2+++++++++++++++++++++++++++++++++++");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        System.out.println("onDestroy2+++++++++++++++++++++++++++++++++++");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        System.out.println("onDetach2+++++++++++++++++++++++++++++++++++");
        super.onDetach();
    }
    public static Fragment getfra(String title){
        Fragment02 fr=new Fragment02();
        Bundle b=new Bundle();
        b.putString("title",title);
        fr.setArguments(b);
        return fr;
    }
}
