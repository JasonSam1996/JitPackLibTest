package com.game.jitpacklibtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.game.easyutils.EasyJitPackToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EasyJitPackToast.show(this,"哈哈哈哈测试jitpack");

    }
}