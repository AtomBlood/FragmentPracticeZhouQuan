package fdn.f.f.fragmentpracticezhouquan.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fdn.f.f.fragmentpracticezhouquan.R;

public class CategoryFragment extends BaseFragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_category,container,false);
        return view;
    }
}
