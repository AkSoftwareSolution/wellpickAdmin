package com.aksoftwaresolution.wellpickadmin.Contract;

import com.aksoftwaresolution.wellpickadmin.Model.PopularImagesList;

import org.json.JSONObject;

import java.util.List;

public interface DataContract {

    interface DataView {
        void showLoading();
        void hideLoading();
        void GetPopularImagesSusses(String response);
        void GetPopularImagesFailure(String message);


    }

    interface DataPresenter {
        void UploadPopularData(String ImagesName,String imagePath);

    }

    interface DataModel {
        void uploadPopularImages(String ImagesName,String imagePath,OnPopularImagesFinishedListener finishedListener);

        interface OnPopularImagesFinishedListener {
            void OnPopularImagesSusses(String response);

            void OnPopularImagesFailure(String message);
        }


    }


}
