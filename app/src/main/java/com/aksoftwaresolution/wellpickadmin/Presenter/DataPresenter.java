package com.aksoftwaresolution.wellpickadmin.Presenter;

import com.aksoftwaresolution.wellpickadmin.Contract.DataContract;
import com.aksoftwaresolution.wellpickadmin.Model.PopularImagesList;

import org.json.JSONObject;

import java.util.List;

public class DataPresenter implements DataContract.DataPresenter,DataContract.DataModel.OnPopularImagesFinishedListener {

    private DataContract.DataModel dataModel;
    private DataContract.DataView dataView;

    public DataPresenter(DataContract.DataView dataView,DataContract.DataModel dataModel){
        this.dataModel=dataModel;
        this.dataView=dataView;

    }
    @Override
    public void OnPopularImagesSusses(JSONObject response) {
        if (dataView!=null){
            dataView.hideLoading();
            dataView.GetPopularImagesSusses(response);
        }

    }

    @Override
    public void OnPopularImagesFailure(String message) {
        if (dataView!=null){
            dataView.hideLoading();
            dataView.GetPopularImagesFailure(message);
        }

    }

    @Override
    public void showAndUploadData(String ImagesName, String imagePath) {

        if (dataView!=null){
            dataView.showLoading();
        }

        dataModel.uploadPopularImages(ImagesName,imagePath,this);

    }
}
