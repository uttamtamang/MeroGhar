package com.example.meroghar.Interfaces;

import com.example.meroghar.Models.User;
import com.example.meroghar.ServerResponse.ImageResponse;
import com.example.meroghar.ServerResponse.SignUpResponse;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface UserApi {

    @POST("users/signup")
    Call<SignUpResponse> signup(@Body User user);

    @POST("users/login")
    Call<SignUpResponse> login(@Body User user);

    @Multipart
    @POST("/upload")
    Call<ImageResponse> uploadImage(@Part MultipartBody.Part Profileimage);

}
