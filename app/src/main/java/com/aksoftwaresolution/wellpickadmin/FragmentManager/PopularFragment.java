package com.aksoftwaresolution.wellpickadmin.FragmentManager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aksoftwaresolution.wellpickadmin.R;


public class PopularFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View popularView=inflater.inflate(R.layout.fragment_popular, container, false);
        if (container!=null)container.removeAllViews();



        return popularView;
    }
}