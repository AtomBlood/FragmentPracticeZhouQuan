package fdn.f.f.fragmentpracticezhouquan.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import fdn.f.f.fragmentpracticezhouquan.R;


public class BaseActivity extends AppCompatActivity {
    @Override
    protected  void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }
}
