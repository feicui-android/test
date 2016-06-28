package com.feicuiedu.gitdroid.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/** 初始创建的*/
public class MainActivity extends AppCompatActivity {
    // 在你的电脑上，找一个位置(你准备clone项目的位置,请保证是英文的)
    // git clone https://github.com/feicui-android/test.git

    // 用AndroidStrudi打个这个项目(刚从github上clone下来的，我的这个项目)

    // 新建一个临时分支, 在临时分支上查看代码(因为一般查看过程，会有一些不小心的修改)
    // git checkout branck temp
    // 这么去做的目的是为了保证你那边master分支内容是干净的(更新后就不会有冲突)

    // 当我这边代码有更新后,你再如下这样去做
    // git checkout master
    // git pull
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a = 1;
        int b = 2;
        int c = 3;
    }
}
