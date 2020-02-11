package com.example.meroghar.Interfaces;

import com.example.meroghar.Models.Property;
import com.example.meroghar.ServerResponse.ImageResponse;

import java.util.List;
import java.util.Properties;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface PropertyApi {
    @POST("/properties")
    Call<Void> postProperty(@Body Property property);


    @Multipart
    @POST("/upload")
    Call<ImageResponse> uploadImage(@Part MultipartBody.Part propertyImage);

//    @GET("/properties")
//    Call<List<Property>> property

}
