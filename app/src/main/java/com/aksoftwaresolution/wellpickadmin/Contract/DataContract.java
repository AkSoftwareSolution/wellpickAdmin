package com.aksoftwaresolution.wellpickadmin.Contract;

import com.aksoftwaresolution.wellpickadmin.Model.PopularImagesList;

import org.json.JSONObject;

import java.util.List;

public interface DataContract {

    interface DataView {
        void showLoading();
        void hideLoading();
        void GetPopularImagesSusses(JSONObject response);
        void GetPopularImagesFailure(String message);


    }

    interface DataPresenter {
        void showAndUploadData(String ImagesName,String imagePath);

    }

    interface DataModel {
        void uploadPopularImages(String ImagesName,String imagePath,OnPopularImagesFinishedListener finishedListener);

        interface OnPopularImagesFinishedListener {
            void OnPopularImagesSusses(JSONObject response);

            void OnPopularImagesFailure(String message);
        }


    }


}
