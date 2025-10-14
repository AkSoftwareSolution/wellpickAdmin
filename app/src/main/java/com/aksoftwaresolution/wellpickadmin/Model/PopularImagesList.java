package com.aksoftwaresolution.wellpickadmin.Model;

public class PopularImagesList {

    String id;
    String ImagesName;
    String ImagesUrl;


    public PopularImagesList(String id ,String ImagesName,String ImagesUrl){
        this.id=id;
        this.ImagesName=ImagesName;
        this.ImagesUrl=ImagesUrl;

    }

    public String getImagesName() {
        return ImagesName;
    }

    public String getId() {
        return id;
    }

    public String getImagesUrl() {
        return ImagesUrl;
    }



}
