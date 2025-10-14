package com.aksoftwaresolution.wellpickadmin.Model;

import android.content.Context;

import com.aksoftwaresolution.wellpickadmin.Contract.DataContract;

public class DataModel implements DataContract.DataModel {
    private Context context;
    public DataModel(Context context){
        this.context=context;

    }


    @Override
    public void uploadPopularImages(String ImagesName, String imagePath, OnPopularImagesFinishedListener finishedListener) {

    }
}
